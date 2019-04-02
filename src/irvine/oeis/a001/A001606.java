package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

/**
 * A001606 Indices of prime Lucas numbers.
 * @author Sean A. Irvine
 */
public class A001606 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!Fibonacci.isLucasPrime(mN));
    return Z.valueOf(mN);
  }
}
