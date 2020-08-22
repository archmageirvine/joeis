package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030538 (2^n+2)*(2^n+4)*(4^n+9*2^n+38)/720.
 * @author Sean A. Irvine
 */
public class A030538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030538() {
    super(new long[] {1024, -1984, 1240, -310, 31}, new long[] {1, 2, 6, 29, 219});
  }
}
