package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161587.
 * @author Sean A. Irvine
 */
public class A161587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161587() {
    super(new long[] {1, -3, 3}, new long[] {1, 24, 73});
  }
}
