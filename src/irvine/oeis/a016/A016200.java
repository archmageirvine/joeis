package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016200 Expansion of <code>1/((1-x)(1-2x)(1-6x))</code>.
 * @author Sean A. Irvine
 */
public class A016200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016200() {
    super(new long[] {12, -20, 9}, new long[] {1, 9, 61});
  }
}
