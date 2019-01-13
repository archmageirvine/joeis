package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016309.
 * @author Sean A. Irvine
 */
public class A016309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016309() {
    super(new long[] {144, -108, 20}, new long[] {1, 20, 292});
  }
}
