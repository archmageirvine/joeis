package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081039 4th binomial transform of (1,3,0,0,0,0,0,.....).
 * @author Sean A. Irvine
 */
public class A081039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081039() {
    super(new long[] {-16, 8}, new long[] {1, 7});
  }
}
