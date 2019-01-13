package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288838.
 * @author Sean A. Irvine
 */
public class A288838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288838() {
    super(new long[] {243, -405, 270, -90, 15}, new long[] {54, 729, 6075, 40095, 229635});
  }
}
