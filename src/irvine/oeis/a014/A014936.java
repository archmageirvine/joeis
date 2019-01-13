package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014936.
 * @author Sean A. Irvine
 */
public class A014936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014936() {
    super(new long[] {361, -399, 39}, new long[] {1, 39, 1122});
  }
}
