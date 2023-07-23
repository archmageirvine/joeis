package irvine.oeis.a050;

/**
 * A050776 Iterated procedure 'composite k added to sum of its prime factors reaches a prime' yields 9 skipped primes.
 * @author Sean A. Irvine
 */
public class A050776 extends A050768 {

  {
    setOffset(1);
  }

  @Override
  protected int iterations() {
    return 9;
  }
}
