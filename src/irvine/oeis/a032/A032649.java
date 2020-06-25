package irvine.oeis.a032;

/**
 * A032649 Numbers n such that n concatenated with <code>n + 9</code> is a lucky number.
 * @author Sean A. Irvine
 */
public class A032649 extends A032640 {

  @Override
  protected int addend() {
    return 9;
  }
}
