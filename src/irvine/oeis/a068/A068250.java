package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068250 <code>1/24</code> the number of colorings of <code>a 3</code> X 3 octagonal array with n colors.
 * @author Sean A. Irvine
 */
public class A068250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068250() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {3, 280, 5265, 47040, 271250, 1170288, 4105710, 12334080, 32837805, 79365000});
  }
}
