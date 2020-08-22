package irvine.oeis.a134;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A134624 a(1) = 1. a(n) = the smallest integer which is &gt; a(n-1) and is different from and not coprime to A134623(n-1).
 * @author Sean A. Irvine
 */
public class A134624 implements Sequence {

  private final TreeSet<Z> mA134624 = new TreeSet<>();
  private Z mA134623 = null;

  protected Z select(final Z a134623, final Z a136424) {
    return a136424;
  }

  @Override
  public Z next() {
    if (mA134624.isEmpty()) {
      mA134624.add(Z.ONE);
      mA134623 = Z.TWO;
    } else {
      Z t = mA134624.last();
      do {
        t = t.add(1);
      } while (t.equals(mA134623) || Z.ONE.equals(t.gcd(mA134623)));
      mA134624.add(t);
      do {
        mA134623 = mA134623.add(1);
      } while (mA134624.contains(mA134623));
    }
    return select(mA134623, mA134624.last());
  }
}
