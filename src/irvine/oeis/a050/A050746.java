package irvine.oeis.a050;

/**
 * A050746 Numbers k such that the decimal expansion of k^7 contains no pair of consecutive equal digits.
 * @author Sean A. Irvine
 */
public class A050746 extends A050741 {

  @Override
  protected long power() {
    return 7;
  }
}

