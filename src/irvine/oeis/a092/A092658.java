package irvine.oeis.a092;

/**
 * A092658 Number of consecutive prime runs of 8 primes congruent to <code>3 mod 4</code> below <code>10^n</code>.
 * @author Sean A. Irvine
 */
public class A092658 extends A092664 {

  @Override
  protected int targetCount() {
    return 8;
  }
}

