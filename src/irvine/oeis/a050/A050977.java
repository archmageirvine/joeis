package irvine.oeis.a050;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050977 Haupt-exponents of 5 modulo integers relatively prime to 5.
 * @author Sean A. Irvine
 */
public class A050977 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN % 5 == 0) {
      ++mN;
    }
    return new IntegersModMul(mN).order(Z.FIVE);
  }
}
