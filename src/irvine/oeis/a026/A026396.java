package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026396 Sum{T(i,j)}, <code>0&lt;=j&lt;=i, 0&lt;=i&lt;=n</code>, where T is the array in A026386.
 * @author Sean A. Irvine
 */
public class A026396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026396() {
    super(new long[] {-5, 5, 1}, new long[] {3, 7, 17});
  }
}
