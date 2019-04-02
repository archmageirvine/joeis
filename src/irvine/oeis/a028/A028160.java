package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028160 Expansion of 1/((1-4x)(1-8x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028160() {
    super(new long[] {-4224, 2320, -440, 35}, new long[] {1, 35, 785, 14395});
  }
}
