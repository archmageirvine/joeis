package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018912 Expansion of 1/((1-4x)(1-5x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A018912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018912() {
    super(new long[] {200, -110, 19}, new long[] {1, 19, 251});
  }
}
