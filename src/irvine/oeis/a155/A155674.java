package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155674 11^n-10^n+1^n.
 * @author Sean A. Irvine
 */
public class A155674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155674() {
    super(new long[] {110, -131, 22}, new long[] {1, 2, 22});
  }
}
