package irvine.oeis.a053;

import java.util.Iterator;
import java.util.LinkedHashSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005900;

/**
 * A053676 Let Oc(n) = A005900(n) = n-th octahedral number. Consider all integer triples (i,j,k), j &gt;= k &gt; 0, with Oc(i) = Oc(j)+Oc(k), ordered by increasing i; sequence gives i values.
 * @author Sean A. Irvine
 */
public class A053676 extends AbstractSequence {

  private final Sequence mUnder;
  protected final LinkedHashSet<Z> mA = new LinkedHashSet<>();
  private Z mPrev = Z.ONE;
  protected long mOffset = 0;

  protected A053676(final Sequence seq) {
    super(1);
    mUnder = seq;
    mUnder.next(); // skip 0
    mA.add(mUnder.next());
  }

  /** Construct the sequence. */
  public A053676() {
    this(new A005900());
  }

  protected Z update() {
    // Drops low terms from memory when they will never be used again
    final Z t = mUnder.next();
    final Z delta = t.subtract(mPrev);
    for (final Iterator<Z> it = mA.iterator(); it.hasNext();) {
      final Z u = it.next();
      if (u.compareTo(delta) >= 0) {
        break;
      }
      it.remove();
      ++mOffset;
    }
    mA.add(t);
    mPrev = t;
    return t;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = update();
      for (final Z u : mA) {
        final Z v = t.subtract(u);
        if (v.compareTo(u) < 0) {
          break;
        }
        if (mA.contains(v)) {
          //StringUtils.message(mA.size() + " " + mOffset);
          return Z.valueOf(mOffset + mA.size());
        }
      }
    }
  }
}
