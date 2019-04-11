package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199690 <code>(11*10^n+1)/3</code>.
 * @author Sean A. Irvine
 */
public class A199690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199690() {
    super(new long[] {-10, 11}, new long[] {4, 37});
  }
}
