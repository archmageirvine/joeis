package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016265 Expansion of <code>1/((1-x)(1-10x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A016265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016265() {
    super(new long[] {110, -131, 22}, new long[] {1, 22, 353});
  }
}
