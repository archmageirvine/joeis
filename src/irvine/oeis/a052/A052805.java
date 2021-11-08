package irvine.oeis.a052;

import irvine.oeis.EulerTransform;
import irvine.oeis.a000.A000912;

/**
 * A052805 If B is a collection in which there are C(n-1) [Catalan numbers, A000108] things with n points, a(n) is the number of subsets without repetition of B with a total of n points.
 * a(n) is the number of subsets without repetition of B with a total of n points.
 *
 * @author Georg Fischer
 */
public class A052805 extends EulerTransform {

  /** Construct the sequence. */
  public A052805() {
    super(new A000912(), 1);
  }
}
