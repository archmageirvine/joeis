package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254602 Numbers of n-length words on alphabet <code>{0..7}</code> with no subwords ii, where i is from <code>{0..2}</code>.
 * @author Sean A. Irvine
 */
public class A254602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254602() {
    super(new long[] {5, 7}, new long[] {1, 8});
  }
}
