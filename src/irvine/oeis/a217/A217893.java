package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217893 <code>50k^2-40k-17</code> interleaved with <code>50k^2+10k+13</code> for <code>k=&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A217893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217893() {
    super(new long[] {1, -2, 0, 2}, new long[] {-17, 13, -7, 73});
  }
}
