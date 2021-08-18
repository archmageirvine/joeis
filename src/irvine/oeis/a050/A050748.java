package irvine.oeis.a050;

/**
 * A050748 Numbers k such that the decimal expansion of k^9 contains no pair of consecutive equal digits.
 * @author Sean A. Irvine
 */
public class A050748 extends A050741 {

  @Override
  protected long power() {
    return 9;
  }
}

