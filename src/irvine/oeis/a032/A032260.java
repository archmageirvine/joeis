package irvine.oeis.a032;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032260 Number of n X n (0,1) matrices such that each row and each column is nondecreasing or nonincreasing.
 * @author Sean A. Irvine
 */
public class A032260 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).subtract(mN).multiply(2 * mN);
  }
}
