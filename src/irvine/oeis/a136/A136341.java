package irvine.oeis.a136;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A136341 Fibonacci primes or semiprimes F(k) such that F(k+1) is again prime or semiprime.
 * @author Georg Fischer
 */
public class A136341 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.TWO;
  private long mK = 0; // for debugging only
  private long mOldBigOmega = 1;

  @Override
  public Z next() {
    while (true) {
      ++mK;
      final Z f = mA.add(mB);
      mA = mB;
      mB = f;
      final long newBigOmega = Jaguar.factor(f).bigOmega();
      final long oldBigOmega = mOldBigOmega;
      mOldBigOmega = newBigOmega;
//      System.err.println("mA=" + mA + ", mB=" + mB + ", f=" + f + ", oldBigOmega=" + oldBigOmega + ", newBigOmega=" + newBigOmega);
//      if ((mK & 0x0) == 0) {
//        System.err.print(" " + mK); // reached Fib(1365), could not factor a 287-digit number
//      }
      if (oldBigOmega <= 2 && newBigOmega <= 2) {
        return mA;
      }
    }
  }
}

