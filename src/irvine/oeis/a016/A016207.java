package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016207 Expansion of 1/((1-x)(1-2x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016207() {
    super(new long[] {24, -38, 15}, new long[] {1, 15, 187});
  }
}
