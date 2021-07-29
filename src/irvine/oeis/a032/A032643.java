package irvine.oeis.a032;

/**
 * A032643 Numbers k such that k concatenated with k+3 is a lucky number.
 * @author Sean A. Irvine
 */
public class A032643 extends A032640 {

  @Override
  protected int addend() {
    return 3;
  }
}
