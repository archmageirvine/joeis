package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025999 Expansion of <code>1/((1-2x)(1-5x)(1-8x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A025999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025999() {
    super(new long[] {-880, 806, -231, 26}, new long[] {1, 26, 445, 6370});
  }
}
