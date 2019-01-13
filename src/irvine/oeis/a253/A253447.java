package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253447.
 * @author Sean A. Irvine
 */
public class A253447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253447() {
    super(new long[] {1, -31, 31}, new long[] {1, 15, 435});
  }
}
