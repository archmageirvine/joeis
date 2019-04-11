package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019757 Expansion of <code>1/((1-5*x)(1-6*x)(1-7*x))</code>.
 * @author Sean A. Irvine
 */
public class A019757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019757() {
    super(new long[] {210, -107, 18}, new long[] {1, 18, 217});
  }
}
