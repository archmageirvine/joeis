package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081033 6th binomial transform of the periodic sequence <code>(1,7,1,1,7,1</code>...).
 * @author Sean A. Irvine
 */
public class A081033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081033() {
    super(new long[] {-35, 12}, new long[] {1, 13});
  }
}
