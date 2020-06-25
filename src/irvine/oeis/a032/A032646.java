package irvine.oeis.a032;

/**
 * A032646 Numbers n such that n concatenated with <code>n + 6</code> is a lucky number.
 * @author Sean A. Irvine
 */
public class A032646 extends A032640 {

  @Override
  protected int addend() {
    return 6;
  }
}
