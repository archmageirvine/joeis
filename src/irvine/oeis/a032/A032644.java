package irvine.oeis.a032;

/**
 * A032644 Numbers n such that n concatenated with <code>n + 4</code> is a lucky number.
 * @author Sean A. Irvine
 */
public class A032644 extends A032640 {

  @Override
  protected int addend() {
    return 4;
  }
}
