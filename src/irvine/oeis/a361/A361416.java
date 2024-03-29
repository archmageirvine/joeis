package irvine.oeis.a361;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A361416 a(n) is the least integer z for which there is a triple (x,y,z) satisfying x^2 + n*x*y + y^2 = z^2 and 0 &lt; x &lt; y &lt; z.
 * @author Sean A. Irvine
 */
public class A361416 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z minZ = null;
    Z y = Z.TWO;
    while (minZ == null || y.compareTo(minZ) < 0) {
      for (Z x = Z.ONE; x.compareTo(y) < 0; x = x.add(1)) {
        final Z z2 = x.square().add(y.square()).add(x.multiply(y).multiply(mN));
        final Z[] z = z2.sqrtAndRemainder();
        if (z[1].isZero() && (minZ == null || z[0].compareTo(minZ) < 0)) {
          minZ = z[0];
        }
      }
      y = y.add(1);
    }
    return minZ;
  }
}
