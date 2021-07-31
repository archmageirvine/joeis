package irvine.oeis.a032;

/**
 * A032646 Numbers k such that k concatenated with k+6 is a lucky number.
 * @author Sean A. Irvine
 */
public class A032646 extends A032640 {

  @Override
  protected int addend() {
    return 6;
  }
}
