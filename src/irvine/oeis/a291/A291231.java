package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291231 p-INVERT of <code>(0,1,0,1,0,1,...),</code> where p(S) <code>= (1 -</code> S)(1 <code>- 2</code> S)(1 <code>- 3</code> S)(1 <code>- 4</code> S).
 * @author Sean A. Irvine
 */
public class A291231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291231() {
    super(new long[] {-1, -10, -31, -20, 40, 20, -31, 10}, new long[] {10, 65, 360, 1831, 8830, 41104, 186710, 833401});
  }
}
