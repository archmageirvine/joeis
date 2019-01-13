package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014930.
 * @author Sean A. Irvine
 */
public class A014930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014930() {
    super(new long[] {225, -255, 31}, new long[] {1, 31, 706});
  }
}
