package irvine.oeis.a092;

/**
 * A092657 Number of consecutive prime runs of 8 primes congruent to 1 mod 4 below 10^n.
 * @author Sean A. Irvine
 */
public class A092657 extends A092663 {

  @Override
  protected int targetCount() {
    return 8;
  }
}

