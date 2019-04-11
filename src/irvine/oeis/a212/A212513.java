package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212513 Number of (w,x,y,z) with all terms in <code>{1,...,n}</code> and w&lt;=2x and y&lt;=3z.
 * @author Sean A. Irvine
 */
public class A212513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212513() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 1, 16, 72, 210, 483, 990, 1760, 2964, 4680, 7040, 10176, 14364, 19551, 26180, 34320});
  }
}
