package irvine.oeis.a050;

/**
 * A050742 Numbers k such that the decimal expansion of k^3 contains no pair of consecutive equal digits.
 * @author Sean A. Irvine
 */
public class A050742 extends A050741 {

  @Override
  protected long power() {
    return 3;
  }
}

