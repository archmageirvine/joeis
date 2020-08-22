package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016094 Expansion of 1/((1-9x)(1-10x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016094() {
    super(new long[] {-11880, 4578, -659, 42}, new long[] {1, 42, 1105, 23310});
  }
}
