package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037597 <code>Base-4</code> digits are, in order, the first n terms of the periodic sequence with initial period 1,3,0.
 * @author Sean A. Irvine
 */
public class A037597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037597() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 7, 28, 113});
  }
}
