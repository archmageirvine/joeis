package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088132 <code>a(n)</code> equals the square of the n-th partial sum added to twice the n-th partial sum of the squares, divided by <code>a(n-1),</code> for all <code>n&gt;1,</code> with <code>a(0)=1, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A088132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088132() {
    super(new long[] {-1, 0, 4}, new long[] {1, 3, 12});
  }
}
