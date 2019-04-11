package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025981 Expansion of <code>1/((1-2x)(1-4x)(1-9x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A025981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025981() {
    super(new long[] {-792, 754, -227, 26}, new long[] {1, 26, 449, 6526});
  }
}
