package irvine.oeis.a057;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a056.A056525;

/**
 * A057332 a(n) is the number of (2n+1)-digit palindromic primes that undulate.
 * @author Sean A. Irvine
 */
public class A057332 extends A056525 {

  /** Construct the sequence. */
  public A057332() {
    super(0);
  }

  private Z mPalin = super.next();
  private Z mLimit = Z.ONE;

  @Override
  public Z next() {
    mLimit = mLimit.multiply(100);
    long cnt = 0;
    while (mPalin.compareTo(mLimit) < 0) {
      if (mPalin.isProbablePrime() && Predicates.DIGIT_UNDULATE.is(mPalin)) {
        ++cnt;
      }
      mPalin = super.next();
    }
    return Z.valueOf(cnt);
  }
}
