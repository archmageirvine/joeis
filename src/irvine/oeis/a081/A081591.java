package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081591 Third row of Pascal-(1,6,1) array A081581.
 * @author Sean A. Irvine
 */
public class A081591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081591() {
    super(new long[] {1, -3, 3}, new long[] {1, 15, 78});
  }
}
