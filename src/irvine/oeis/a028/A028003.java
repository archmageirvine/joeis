package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028003 Expansion of <code>1/((1-2x)(1-6x)(1-10x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A028003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028003() {
    super(new long[] {-1440, 1224, -308, 30}, new long[] {1, 30, 592, 9744});
  }
}
