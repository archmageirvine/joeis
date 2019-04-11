package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024347 Expansion of <code>1/((1-x)(1-6x)(1-9x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A024347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024347() {
    super(new long[] {-648, 882, -261, 28}, new long[] {1, 28, 523, 8218});
  }
}
