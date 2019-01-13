package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016212.
 * @author Sean A. Irvine
 */
public class A016212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016212() {
    super(new long[] {21, -31, 11}, new long[] {1, 11, 90});
  }
}
