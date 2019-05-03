package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026393 <code>a(n) = T(n,n-2)</code>, where T is the array in <code>A026386</code>.
 * @author Sean A. Irvine
 */
public class A026393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026393() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 8, 17, 24});
  }
}
