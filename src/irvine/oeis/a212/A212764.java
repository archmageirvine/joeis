package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212764 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code>, w, x and y odd, and z odd.
 * @author Sean A. Irvine
 */
public class A212764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212764() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {0, 1, 8, 16, 54, 81, 192, 256, 500});
  }
}
