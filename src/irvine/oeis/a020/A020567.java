package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020567 Expansion of <code>1/((1-5x)(1-10x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A020567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020567() {
    super(new long[] {550, -215, 26}, new long[] {1, 26, 461});
  }
}
