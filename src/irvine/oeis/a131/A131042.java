package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131042 Natural numbers <code>A000027</code> with <code>6n+3</code> and <code>6n+4</code> terms swapped.
 * @author Sean A. Irvine
 */
public class A131042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131042() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 3, 5, 6, 7});
  }
}
