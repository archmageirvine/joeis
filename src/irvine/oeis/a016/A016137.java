package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016137 Expansion of 1/((1-3*x)*(1-6*x)).
 * @author Sean A. Irvine
 */
public class A016137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016137() {
    super(new long[] {-18, 9}, new long[] {1, 9});
  }
}
