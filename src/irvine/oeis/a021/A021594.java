package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021594 Expansion of <code>1/((1-x)(1-3x)(1-7x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A021594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021594() {
    super(new long[] {-189, 300, -130, 20}, new long[] {1, 20, 270, 3100});
  }
}
