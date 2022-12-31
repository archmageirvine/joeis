package irvine.oeis.a086;
// manually concatf at 2022-12-30 21:09

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;
import irvine.oeis.a118.A118385;

/**
 * A086158 Concatenation of the smaller members of first n pairs of twin primes.
 * @author Georg Fischer
 */
public class A086158 extends A118385 {

  /** Construct the sequence. */
  public A086158() {
    super(2, new A001359(), 10);
  }

  @Override
  public Z next() {
    if (mN == 2) {
      ++mN;
      return Z.FIVE;
    }
    return super.next();
  }
}
