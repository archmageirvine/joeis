package irvine.oeis.a092;

/**
 * A092661 Number of consecutive prime runs of 9 primes congruent to 3 mod 4 below 10^n.
 * @author Sean A. Irvine
 */
public class A092661 extends A092664 {

  @Override
  protected int targetCount() {
    return 9;
  }
}

