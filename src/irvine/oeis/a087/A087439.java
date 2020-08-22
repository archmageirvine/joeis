package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087439 Expansion of (1-4x)/((1-x)(1-3x)(1-5x)).
 * @author Sean A. Irvine
 */
public class A087439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087439() {
    super(new long[] {15, -23, 9}, new long[] {1, 5, 22});
  }
}
