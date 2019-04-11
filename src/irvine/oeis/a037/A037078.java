package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037078 In ternary expansion of <code>n,</code> reading from right to left, digits occur in order ...,0,1,2,0,1,2,...
 * @author Sean A. Irvine
 */
public class A037078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037078() {
    super(new long[] {-3, 0, 1, 3, 0}, new long[] {0, 1, 2, 3, 7});
  }
}
