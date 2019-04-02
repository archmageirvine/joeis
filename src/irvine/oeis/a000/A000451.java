package irvine.oeis.a000;

/**
 * A000451 Smallest number that is the sum of 3 squares in at least n ways.
 * @author Sean A. Irvine
 */
public class A000451 extends A000437 {

  @Override
  protected boolean accept(final int count, final int n) {
    return count >= n;
  }
}
