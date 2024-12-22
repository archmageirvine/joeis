package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073828.
 * @author Sean A. Irvine
 */
public class A073848 extends Sequence1 {

  // For n!=4: a(n)=(p_1*p_2*...p_r)^n/n-n*(n-1)/2 with prime factorization n=p_1^b_1*...*p_r^b_r

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 4) {
      return Z.valueOf(58);
    }
    return Functions.SQUARE_FREE_KERNEL.z(mN).pow(mN).divide(mN).subtract(Functions.TRIANGULAR.z(mN - 1));
  }
}
