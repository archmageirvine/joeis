package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096957 Fourth column <code>(m=3)</code> of <code>(1,6)-Pascal</code> triangle <code>A096956</code>.
 * @author Sean A. Irvine
 */
public class A096957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096957() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 19, 40, 70});
  }
}
