package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021202 Expansion of <code>1/((1-x)(1-2x)(1-6x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A021202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021202() {
    super(new long[] {-120, 212, -110, 19}, new long[] {1, 19, 251, 2891});
  }
}
