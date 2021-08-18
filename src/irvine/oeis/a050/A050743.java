package irvine.oeis.a050;

/**
 * A050743 Numbers k such that the decimal expansion of k^4 contains no pair of consecutive equal digits.
 * @author Sean A. Irvine
 */
public class A050743 extends A050741 {

  @Override
  protected long power() {
    return 4;
  }
}

