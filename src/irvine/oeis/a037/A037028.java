package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037028 Prime closest to e^n.
 * @author Sean A. Irvine
 */
public class A037028 implements Sequence {

  private static final int TOLERANCE = -64; // in bits
  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO; // So we don't look for a prime < 1
    }
    final CR en = CR.valueOf(mN).exp();
    final Z r = en.round();
    final Z prev = mPrime.prevPrime(r.add(1));
    final Z next = mPrime.nextPrime(r.subtract(1));
    return en.subtract(CR.valueOf(prev)).compareTo(CR.valueOf(next).subtract(en), TOLERANCE) <= 0 ? prev : next;
  }
}

