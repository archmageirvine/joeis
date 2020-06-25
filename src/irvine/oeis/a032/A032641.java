package irvine.oeis.a032;

/**
 * A032641 Numbers n such that n concatenated with <code>n + 1</code> is a lucky number.
 * @author Sean A. Irvine
 */
public class A032641 extends A032640 {

  @Override
  protected int addend() {
    return 1;
  }
}
