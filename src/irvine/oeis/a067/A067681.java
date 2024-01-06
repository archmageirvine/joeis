package irvine.oeis.a067;

/**
 * A067681 Diagonals and antidiagonals of the prime-composite array, B(m,n) which are zeros from the Third Borve Conjecture.
 * @author Sean A. Irvine
 */
public class A067681 extends A067677 {

  @Override
  protected boolean is(long c) {
    if (!super.is(c)) {
      return false;
    }
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p > c) {
        return true;
      }
      if (c % p == 0) {
        return false;
      }
      while (mPrime.isPrime(--c)) {
        // do nothing
      }
    }
  }
}
