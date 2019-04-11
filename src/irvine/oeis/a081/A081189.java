package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081189 7th binomial transform of <code>(1,0,1,0,1,</code>...), A059841.
 * @author Sean A. Irvine
 */
public class A081189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081189() {
    super(new long[] {-48, 14}, new long[] {1, 7});
  }
}
