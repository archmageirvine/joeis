package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254657 Numbers of words on alphabet <code>{0,1,...,8}</code> with no subwords ii, where i is from <code>{0,1,2}</code>.
 * @author Sean A. Irvine
 */
public class A254657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254657() {
    super(new long[] {6, 8}, new long[] {1, 9});
  }
}
