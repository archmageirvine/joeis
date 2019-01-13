package irvine.oeis.a013;

/**
 * A013657.
 * @author Sean A. Irvine
 */
public class A013657 extends A013653 {

  @Override
  protected boolean test(final int oneCount, final boolean consecutiveOne) {
    return consecutiveOne;
  }
}
