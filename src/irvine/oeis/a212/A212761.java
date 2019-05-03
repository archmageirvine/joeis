package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212761 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code>, w odd, x and y even.
 * @author Sean A. Irvine
 */
public class A212761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212761() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {0, 2, 12, 32, 90, 162, 336, 512, 900});
  }
}
