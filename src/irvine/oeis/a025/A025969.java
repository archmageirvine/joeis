package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025969 Expansion of <code>1/((1-2x)(1-4x)(1-6x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A025969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025969() {
    super(new long[] {-528, 532, -176, 23}, new long[] {1, 23, 353, 4603});
  }
}
