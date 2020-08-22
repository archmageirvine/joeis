package irvine.oeis.a032;

/**
 * A032648 Numbers n such that n concatenated with n + 8 is a lucky number.
 * @author Sean A. Irvine
 */
public class A032648 extends A032640 {

  @Override
  protected int addend() {
    return 8;
  }
}
