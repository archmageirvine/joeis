package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000292;
import java.util.HashSet;

/**
 * A002311 n-th tetrahedral number is the sum of 2 tetrahedral numbers.
 * @author Sean A. Irvine
 */
public class A002311 extends A000292 {

  private long mN = 0;
  private final HashSet<Z> mSum = new HashSet<>();

  {
    super.next(); // skip leading 0
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z n = super.next();
      final A000292 tetra = new A000292();
      tetra.next(); // skip leading 0
      while (true) {
        final Z q = tetra.next();
        mSum.add(n.add(q));
        if (q.equals(n)) {
          break;
        }
      }
      if (mSum.contains(n)) {
        return Z.valueOf(mN);
      }
    }
  }
}
