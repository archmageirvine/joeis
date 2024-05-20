package irvine.oeis.a278;
// manually robots/union2 at 2023-08-23 09:55


import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A278021 Numbers n such that n - lambda(n) is prime, where lambda = A002322.
 * @author Georg Fischer
 */
public class A278021 extends Sequence1 {

  private long mK = 0;

  @Override
  public Z next() {
    while (true) {
      ++mK;
      if (Z.valueOf(mK).subtract(Functions.CARMICHAEL_LAMBDA.z(mK)).isProbablePrime()) {
        return Z.valueOf(mK);
      }
    }
  }
}
