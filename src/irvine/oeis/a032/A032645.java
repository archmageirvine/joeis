package irvine.oeis.a032;

/**
 * A032645 Numbers k such that k concatenated with k+5 is a lucky number.
 * @author Sean A. Irvine
 */
public class A032645 extends A032640 {

  @Override
  protected int addend() {
    return 5;
  }
}
