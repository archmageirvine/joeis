package irvine.oeis.a045;

/**
 * A045942 Numbers k such that the factorizations of k through k+5 have the same number of primes (including multiplicities).
 * @author Sean A. Irvine
 */
public class A045942 extends A045939 {

  @Override
  protected long add() {
    return 5;
  }
}
