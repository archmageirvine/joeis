package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026108 Expansion of <code>1/((1-2x)(1-5x)(1-9x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A026108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026108() {
    super(new long[] {-1080, 966, -265, 28}, new long[] {1, 28, 519, 8078});
  }
}
