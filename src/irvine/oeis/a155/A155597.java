package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155597.
 * @author Sean A. Irvine
 */
public class A155597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155597() {
    super(new long[] {12, -20, 9}, new long[] {1, 5, 33});
  }
}
