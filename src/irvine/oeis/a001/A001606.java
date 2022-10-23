package irvine.oeis.a001;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001606 Indices of prime Lucas numbers.
 * @author Sean A. Irvine
 */
public class A001606 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!Fibonacci.isLucasPrime(mN));
    return Z.valueOf(mN);
  }
}
