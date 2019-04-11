package irvine.oeis.a092;

/**
 * A092657 Number of consecutive prime runs of 8 primes congruent to <code>1 mod 4</code> below <code>10^n</code>.
 * @author Sean A. Irvine
 */
public class A092657 extends A092663 {

  @Override
  protected int targetCount() {
    return 8;
  }
}

