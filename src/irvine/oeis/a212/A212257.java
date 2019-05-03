package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212257 Number of <code>(v,w,x,y,z)</code> with all terms in <code>{0,1,...,n}</code> and <code>v=average(w,x,y,z)</code>.
 * @author Sean A. Irvine
 */
public class A212257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212257() {
    super(new long[] {1, -4, 6, -4, 0, 4, -6, 4}, new long[] {1, 2, 21, 64, 157, 322, 601, 1024});
  }
}
