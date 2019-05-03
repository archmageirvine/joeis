package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093918 <code>a(2k-1)=(2k-1)^2+k, a(2k)=6k^2+k+1</code>: Last term in rows of triangle <code>A093915</code>.
 * @author Sean A. Irvine
 */
public class A093918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093918() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {2, 8, 11, 27, 28, 58});
  }
}
