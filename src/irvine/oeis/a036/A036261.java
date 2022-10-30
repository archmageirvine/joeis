package irvine.oeis.a036;

/**
 * A036261 Triangle of numbers arising from Gilbreath's conjecture: successive absolute differences of primes (read by antidiagonals upwards, omitting the initial row of primes).
 * @author Sean A. Irvine
 */
public class A036261 extends A036262 {

  {
    setOffset(1);
  }

  @Override
  protected int min() {
    return 1;
  }
}

