package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026393 <code>a(n) =</code> T(n,n-2), where T is the array in A026386.
 * @author Sean A. Irvine
 */
public class A026393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026393() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 8, 17, 24});
  }
}
