package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016217 Expansion of <code>1/((1-x)(1-3x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A016217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016217() {
    super(new long[] {36, -51, 16}, new long[] {1, 16, 205});
  }
}
