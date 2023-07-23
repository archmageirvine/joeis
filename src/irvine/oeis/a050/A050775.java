package irvine.oeis.a050;

/**
 * A050775 Iterated procedure 'composite k added to sum of its prime factors reaches a prime' yields 8 skipped primes.
 * @author Sean A. Irvine
 */
public class A050775 extends A050768 {

  {
    setOffset(1);
  }

  @Override
  protected int iterations() {
    return 8;
  }
}
