package irvine.oeis.a032;

/**
 * A032642 Numbers n such that n concatenated with <code>n + 2</code> is a lucky number.
 * @author Sean A. Irvine
 */
public class A032642 extends A032640 {

  @Override
  protected int addend() {
    return 2;
  }
}
