package irvine.oeis.a050;

/**
 * A050744 Numbers k such that the decimal expansion of k^5 contains no pair of consecutive equal digits.
 * @author Sean A. Irvine
 */
public class A050744 extends A050741 {

  @Override
  protected long power() {
    return 5;
  }
}

