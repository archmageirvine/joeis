package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016302.
 * @author Sean A. Irvine
 */
public class A016302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016302() {
    super(new long[] {120, -94, 19}, new long[] {1, 19, 267});
  }
}
