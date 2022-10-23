package irvine.oeis.a097;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A097932 Positive integers n such that 2n-19 is prime.
 *
 * @author Karsten Knuth
 */
public class A097932 extends Sequence1 {

    private final Fast mPrime = new Fast();
    private long mN = 0;

    @Override
    public Z next() {
        while (true) {
            if (mPrime.isPrime(Z.valueOf(++mN).multiply2().subtract(19))) {
                return Z.valueOf(mN);
            }
        }
    }
}

