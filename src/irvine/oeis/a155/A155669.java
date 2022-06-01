package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155669 10^n+9^n-1.
 * @author Sean A. Irvine
 */
public class A155669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155669() {
    super(new long[] {90, -109, 20}, new long[] {1, 18, 180});
  }
}
