package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212747 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code> and <code>2w=floor((x+y+z)/2))</code>.
 * @author Sean A. Irvine
 */
public class A212747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212747() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {1, 4, 13, 32, 63, 108});
  }
}
