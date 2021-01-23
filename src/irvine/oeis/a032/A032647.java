package irvine.oeis.a032;

/**
 * A032647 Numbers n such that n concatenated with n + 7 is a lucky number.
 * @author Sean A. Irvine
 */
public class A032647 extends A032640 {

  @Override
  protected int addend() {
    return 7;
  }
}
