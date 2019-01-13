package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087161.
 * @author Sean A. Irvine
 */
public class A087161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087161() {
    super(new long[] {2, -6, 5}, new long[] {1, 2, 4});
  }
}
