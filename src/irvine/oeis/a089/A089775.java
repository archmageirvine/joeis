package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089775 Lucas numbers L(12n).
 * @author Sean A. Irvine
 */
public class A089775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089775() {
    super(new long[] {-1, 322}, new long[] {2, 322});
  }
}
