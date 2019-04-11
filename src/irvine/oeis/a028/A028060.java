package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028060 Expansion of <code>1/((1-3x)(1-5x)(1-7x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A028060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028060() {
    super(new long[] {-945, 744, -206, 24}, new long[] {1, 24, 370, 4680});
  }
}
