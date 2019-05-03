package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037681 <code>Base-4</code> digits are, in order, the first n terms of the periodic sequence with initial period 1,0,3,2.
 * @author Sean A. Irvine
 */
public class A037681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037681() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {1, 4, 19, 78, 313});
  }
}
