package irvine.oeis.a050;

/**
 * A050745 Numbers k such that the decimal expansion of k^6 contains no pair of consecutive equal digits.
 * @author Sean A. Irvine
 */
public class A050745 extends A050741 {

  @Override
  protected long power() {
    return 6;
  }
}

