package irvine.oeis.a032;

/**
 * A032645 Numbers n such that n concatenated with <code>n + 5</code> is a lucky number.
 * @author Sean A. Irvine
 */
public class A032645 extends A032640 {

  @Override
  protected int addend() {
    return 5;
  }
}
