package irvine.oeis.a032;

/**
 * A032649 Numbers n such that n concatenated with n + 9 is a lucky number.
 * @author Sean A. Irvine
 */
public class A032649 extends A032640 {

  @Override
  protected int addend() {
    return 9;
  }
}
