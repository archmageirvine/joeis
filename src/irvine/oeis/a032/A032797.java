package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032797 Numbers n such that <code>n(n+1)(n+2)</code>...(n+10) <code>/(n+(n+1)+(n+2)+</code>...+(n+10)) is a multiple of n.
 * @author Sean A. Irvine
 */
public class A032797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032797() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 7, 8, 9, 10, 12});
  }
}
