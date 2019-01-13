package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016094.
 * @author Sean A. Irvine
 */
public class A016094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016094() {
    super(new long[] {-11880, 4578, -659, 42}, new long[] {1, 42, 1105, 23310});
  }
}
