package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254662 Numbers of words on alphabet <code>{0,1,...,7}</code> with no subwords ii, where i is from <code>{0,1,...,4}</code>.
 * @author Sean A. Irvine
 */
public class A254662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254662() {
    super(new long[] {3, 7}, new long[] {1, 8});
  }
}
