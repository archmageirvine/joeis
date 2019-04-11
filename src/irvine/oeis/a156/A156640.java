package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156640 <code>169n^2 + 140n + 29</code>.
 * @author Sean A. Irvine
 */
public class A156640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156640() {
    super(new long[] {1, -3, 3}, new long[] {29, 338, 985});
  }
}
