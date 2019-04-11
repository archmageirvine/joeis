package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016137 Expansion of <code>1/((1-3x)(1-6x))</code>.
 * @author Sean A. Irvine
 */
public class A016137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016137() {
    super(new long[] {-18, 9}, new long[] {1, 9});
  }
}
