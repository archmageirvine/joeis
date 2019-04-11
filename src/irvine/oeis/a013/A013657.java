package irvine.oeis.a013;

/**
 * A013657 Period of continued fraction for <code>sqrt(n)</code> contains more than one 1, but no two consecutive 1's.
 * @author Sean A. Irvine
 */
public class A013657 extends A013653 {

  @Override
  protected boolean test(final int oneCount, final boolean consecutiveOne) {
    return consecutiveOne;
  }
}
