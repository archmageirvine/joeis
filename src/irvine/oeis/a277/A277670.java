package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277670.
 * @author Sean A. Irvine
 */
public class A277670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277670() {
    super(new long[] {1, -2, 3, -4, 5, -6, 7}, new long[] {1, 7, 43, 264, 1621, 9953, 61112});
  }
}
