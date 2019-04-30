package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254598 Numbers of n-length words on alphabet <code>{0,1,...,8}</code> with no subwords <code>ii</code>, for i from <code>{0,1}</code>.
 * @author Sean A. Irvine
 */
public class A254598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254598() {
    super(new long[] {7, 8}, new long[] {1, 9});
  }
}
