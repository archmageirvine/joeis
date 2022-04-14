package irvine.oeis.a097;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A097363 Positive integers n such that 2n-13 is prime.
 *
 * @author Karsten Knuth
 */
public class A097363 implements Sequence {

    private final Fast mPrime = new Fast();
    private long mN = 0;

    @Override
    public Z next() {
        while (true) {
            if (mPrime.isPrime(Z.valueOf(++mN).multiply2().subtract(13))) {
                return Z.valueOf(mN);
            }
        }
    }
}

