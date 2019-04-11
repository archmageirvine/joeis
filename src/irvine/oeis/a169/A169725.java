package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169725 <code>3^(n-1)*(6*3^(n-1)+5)+1</code>.
 * @author Sean A. Irvine
 */
public class A169725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169725() {
    super(new long[] {27, -39, 13}, new long[] {12, 70, 532});
  }
}
