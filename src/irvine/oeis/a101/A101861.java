package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101861 <code>n*(n+5)*(50+45*n+n^2)/24</code>.
 * @author Sean A. Irvine
 */
public class A101861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101861() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {24, 84, 194, 369, 625});
  }
}
