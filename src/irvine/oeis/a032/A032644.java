package irvine.oeis.a032;

/**
 * A032644 Numbers k such that k concatenated with k+4 is a lucky number.
 * @author Sean A. Irvine
 */
public class A032644 extends A032640 {

  @Override
  protected int addend() {
    return 4;
  }
}
