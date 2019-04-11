package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028093 Expansion of <code>1/((1-3x)(1-7x)(1-9x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A028093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028093() {
    super(new long[] {-1890, 1299, -301, 29}, new long[] {1, 29, 540, 8230});
  }
}
