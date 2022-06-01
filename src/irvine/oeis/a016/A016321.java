package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016321 Expansion of 1/((1-2x)(1-9x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A016321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016321() {
    super(new long[] {180, -128, 21}, new long[] {1, 21, 313});
  }
}
