package irvine.oeis.a032;

/**
 * A032641 Numbers k such that k concatenated with k+1 is a lucky number.
 * @author Sean A. Irvine
 */
public class A032641 extends A032640 {

  @Override
  protected int addend() {
    return 1;
  }
}
