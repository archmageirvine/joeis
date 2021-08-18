package irvine.oeis.a050;

/**
 * A050747 Numbers k such that the decimal expansion of k^8 contains no pair of consecutive equal digits.
 * @author Sean A. Irvine
 */
public class A050747 extends A050741 {

  @Override
  protected long power() {
    return 8;
  }
}

