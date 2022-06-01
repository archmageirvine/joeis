package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169723 3^(n-1)*(2*3^(n-1)+3)+1.
 * @author Sean A. Irvine
 */
public class A169723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169723() {
    super(new long[] {27, -39, 13}, new long[] {6, 28, 190});
  }
}
