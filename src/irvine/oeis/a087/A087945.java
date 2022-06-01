package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087945 Expansion of (1-2x-x^2)/((1-2x)(1-4x+x^2)).
 * @author Sean A. Irvine
 */
public class A087945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087945() {
    super(new long[] {2, -9, 6}, new long[] {1, 4, 14});
  }
}
