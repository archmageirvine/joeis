package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016140 Expansion of 1/((1-3x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A016140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016140() {
    super(new long[] {-24, 11}, new long[] {1, 11});
  }
}
