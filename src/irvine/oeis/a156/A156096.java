package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156096 Inverse binomial transform of A030186.
 * @author Sean A. Irvine
 */
public class A156096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156096() {
    super(new long[] {2, 4, 0}, new long[] {1, 1, 4});
  }
}
