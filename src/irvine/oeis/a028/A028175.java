package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028175 Expansion of <code>1/((1-5x)(1-6x)(1-9x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A028175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028175() {
    super(new long[] {-2970, 1689, -349, 31}, new long[] {1, 31, 612, 9842});
  }
}
