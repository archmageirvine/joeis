package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005900;

/**
 * A053677 Let Oc(n) = A005900(n) = n-th octahedral number. Consider all integer triples (i,j,k), j &gt;= k &gt; 0, with Oc(i) = Oc(j)+Oc(k), ordered by increasing i; sequence gives j values.
 * @author Sean A. Irvine
 */
public class A053677 extends A053676 {

  protected A053677(final Sequence seq) {
    super(seq);
  }

  /** Construct the sequence. */
  public A053677() {
    this(new A005900());
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
          int k = 0;
          for (final Z w : mA) {
            ++k;
            if (w.equals(v)) {
              return Z.valueOf(mOffset + k);
            }
          }
        }
      }
    }
  }
}
