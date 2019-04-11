package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081035 8th binomial transform of the periodic sequence <code>(1,9,1,1,9,1</code>...).
 * @author Sean A. Irvine
 */
public class A081035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081035() {
    super(new long[] {-63, 16}, new long[] {1, 17});
  }
}
