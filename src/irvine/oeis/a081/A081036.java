package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081036 9th binomial transform of the periodic sequence <code>(1,10,1,1,10,1</code>...).
 * @author Sean A. Irvine
 */
public class A081036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081036() {
    super(new long[] {-80, 18}, new long[] {1, 19});
  }
}
