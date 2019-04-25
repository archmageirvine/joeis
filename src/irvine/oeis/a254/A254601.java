package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254601 Numbers of n-length words on alphabet <code>{0,1,...,6}</code> with no subwords <code>ii,</code> where i is from <code>{0,1,2}</code>.
 * @author Sean A. Irvine
 */
public class A254601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254601() {
    super(new long[] {4, 6}, new long[] {1, 7});
  }
}
