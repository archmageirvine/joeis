package irvine.oeis.a361;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A361417 a(n) is the least integer z for which there is a triple (x,y,z) satisfying x^3 + n*x*y + y^3 = z^3 and 0 &lt; x &lt; y &lt; z.
 * @author Sean A. Irvine
 */
public class A361417 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z minZ = null;
    Z y = Z.TWO;
    while (minZ == null || y.compareTo(minZ) < 0) {
      for (Z x = Z.ONE; x.compareTo(y) < 0; x = x.add(1)) {
        final Z z3 = x.pow(3).add(y.pow(3)).add(x.multiply(y).multiply(mN));
        final Z z = z3.root(3);
        if (z.auxiliary() == 1 && (minZ == null || z.compareTo(minZ) < 0)) {
          minZ = z;
        }
      }
      y = y.add(1);
    }
    return minZ;
  }
}
