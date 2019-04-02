package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100295 Simple recursive sequence generated from a symmetric matrix.
 * @author Sean A. Irvine
 */
public class A100295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100295() {
    super(new long[] {-1, 2, 4}, new long[] {1, 3, 14});
  }
}
