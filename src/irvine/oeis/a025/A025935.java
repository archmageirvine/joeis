package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025935 Expansion of <code>1/((1-2x)(1-3x)(1-5x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A025935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025935() {
    super(new long[] {-330, 371, -141, 21}, new long[] {1, 21, 300, 3710});
  }
}
