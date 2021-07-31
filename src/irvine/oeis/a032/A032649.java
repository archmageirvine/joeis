package irvine.oeis.a032;

/**
 * A032649 Numbers k such that k concatenated with k+9 is a lucky number.
 * @author Sean A. Irvine
 */
public class A032649 extends A032640 {

  @Override
  protected int addend() {
    return 9;
  }
}
