package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028208.
 * @author Sean A. Irvine
 */
public class A028208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028208() {
    super(new long[] {-5040, 2484, -448, 35}, new long[] {1, 35, 777, 13999});
  }
}
