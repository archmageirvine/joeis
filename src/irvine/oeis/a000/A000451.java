package irvine.oeis.a000;

/**
 * A000451.
 * @author Sean A. Irvine
 */
public class A000451 extends A000437 {

  @Override
  protected boolean accept(final int count, final int n) {
    return count >= n;
  }
}
