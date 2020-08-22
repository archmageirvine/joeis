package irvine.oeis.a092;

/**
 * A092658 Number of consecutive prime runs of 8 primes congruent to 3 mod 4 below 10^n.
 * @author Sean A. Irvine
 */
public class A092658 extends A092664 {

  @Override
  protected int targetCount() {
    return 8;
  }
}

