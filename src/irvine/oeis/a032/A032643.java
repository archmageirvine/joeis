package irvine.oeis.a032;

/**
 * A032643 Numbers n such that n concatenated with n + 3 is a lucky number.
 * @author Sean A. Irvine
 */
public class A032643 extends A032640 {

  @Override
  protected int addend() {
    return 3;
  }
}
