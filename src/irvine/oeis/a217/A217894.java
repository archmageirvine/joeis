package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217894 50k^2-20k-23 interleaved with 50k^2+30k+17 for k=&gt;0.
 * @author Sean A. Irvine
 */
public class A217894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217894() {
    super(new long[] {1, -2, 0, 2}, new long[] {-23, 17, 7, 97});
  }
}
