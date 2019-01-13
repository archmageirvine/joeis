package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098821.
 * @author Sean A. Irvine
 */
public class A098821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098821() {
    super(new long[] {4, -8, 5}, new long[] {4, 4, 5});
  }
}
