package irvine.oeis.a065;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a039.A039916;

/**
 * A065965 Numbers k that divide A039916(k).
 * @author Sean A. Irvine
 */
public class A065965 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065965() {
    super(1, 1, new A039916(), DIVISIBLE_BY_INDEX);
  }
}
