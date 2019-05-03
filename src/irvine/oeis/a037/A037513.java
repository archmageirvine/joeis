package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037513 <code>Base-4</code> digits are, in order, the first n terms of the periodic sequence with initial period 2,0,1.
 * @author Sean A. Irvine
 */
public class A037513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037513() {
    super(new long[] {-4, 1, 0, 4}, new long[] {2, 8, 33, 134});
  }
}
