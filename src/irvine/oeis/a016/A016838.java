package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016838.
 * @author Sean A. Irvine
 */
public class A016838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016838() {
    super(new long[] {1, -3, 3}, new long[] {9, 49, 121});
  }
}
