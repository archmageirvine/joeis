package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A032591 Four consecutive primes whose 'last digit cycle' equals {1,3,7,9}.
 * @author Sean A. Irvine
 */
public class A032591 extends A000040 {

  {
    setOffset(0);
  }

  private Z[] mQueue = new Z[3];
  private int mIndex = mQueue.length;

  @Override
  public Z next() {
    if (mIndex == mQueue.length) {
      mIndex = 0;
      while (true) {
        final Z p = super.next();
        if (p.mod(10) != 1) {
          continue;
        }
        final Z p1 = mPrime.nextPrime(p);
        if (p1.mod(10) != 3) {
          continue;
          }
        mQueue[0] = p1;
        final Z p2 = mPrime.nextPrime(p1);
        if (p2.mod(10) != 7) {
          continue;
        }
        mQueue[1] = p2;
          final Z p3 = mPrime.nextPrime(p2);
        if (p3.mod(10) != 9) {
          continue;
        }
        mQueue[2] = p3;
        return p;
      }
    }
    return mQueue[mIndex++];
  }
}
