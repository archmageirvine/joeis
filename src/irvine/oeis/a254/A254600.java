package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254600 Numbers of words on alphabet <code>{0,1,...,10}</code> with no subwords <code>ii</code>, for i from <code>{0,1}</code>.
 * @author Sean A. Irvine
 */
public class A254600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254600() {
    super(new long[] {9, 10}, new long[] {1, 11});
  }
}
