package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155620.
 * @author Sean A. Irvine
 */
public class A155620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155620() {
    super(new long[] {36, -49, 14}, new long[] {1, 12, 96});
  }
}
