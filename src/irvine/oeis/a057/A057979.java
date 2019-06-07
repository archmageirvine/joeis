package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057979 <code>a(n) = 1</code> for even n and <code>(n-1)/2</code> for odd <code>n</code>.
 * @author Sean A. Irvine
 */
public class A057979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057979() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 0, 1, 1});
  }
}
