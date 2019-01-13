package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016958.
 * @author Sean A. Irvine
 */
public class A016958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016958() {
    super(new long[] {1, -3, 3}, new long[] {16, 100, 256});
  }
}
