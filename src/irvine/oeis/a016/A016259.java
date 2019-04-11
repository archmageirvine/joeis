package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016259 Expansion of <code>1/((1-x)(1-8x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A016259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016259() {
    super(new long[] {88, -107, 20}, new long[] {1, 20, 293});
  }
}
