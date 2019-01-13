package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087645.
 * @author Sean A. Irvine
 */
public class A087645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087645() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2, 6, 24, 72, 172});
  }
}
