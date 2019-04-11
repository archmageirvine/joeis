package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138233 <code>2^(2*n+1) + 3^(2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A138233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138233() {
    super(new long[] {-36, 13}, new long[] {5, 35});
  }
}
