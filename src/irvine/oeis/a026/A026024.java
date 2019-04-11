package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026024 Expansion of <code>1/((1-2x)(1-5x)(1-9x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A026024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026024() {
    super(new long[] {-900, 820, -233, 26}, new long[] {1, 26, 443, 6280});
  }
}
