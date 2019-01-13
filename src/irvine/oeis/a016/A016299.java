package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016299.
 * @author Sean A. Irvine
 */
public class A016299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016299() {
    super(new long[] {100, -80, 17}, new long[] {1, 17, 209});
  }
}
