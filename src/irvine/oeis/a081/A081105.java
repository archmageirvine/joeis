package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081105 5th Binomial transform of (1,1,0,0,0,0,.....).
 * @author Sean A. Irvine
 */
public class A081105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081105() {
    super(new long[] {-25, 10}, new long[] {1, 6});
  }
}
