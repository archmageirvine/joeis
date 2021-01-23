package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088132 a(n) equals the square of the n-th partial sum added to twice the n-th partial sum of the squares, divided by a(n-1), for all n&gt;1, with a(0)=1, a(1)=3.
 * @author Sean A. Irvine
 */
public class A088132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088132() {
    super(new long[] {-1, 0, 4}, new long[] {1, 3, 12});
  }
}
