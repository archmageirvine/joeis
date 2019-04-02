package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016092 Expansion of 1/((1-8x)(1-9x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016092() {
    super(new long[] {-9504, 3900, -595, 40}, new long[] {1, 40, 1005, 20300});
  }
}
