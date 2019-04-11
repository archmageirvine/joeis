package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016190 Expansion of <code>1/((1-9x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A016190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016190() {
    super(new long[] {-99, 20}, new long[] {1, 20});
  }
}
