package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057979 a(n) = 1 for even n and (n-1)/2 for odd n.
 * @author Sean A. Irvine
 */
public class A057979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057979() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 0, 1, 1});
  }
}
