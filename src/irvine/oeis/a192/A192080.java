package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192080 Expansion of 1/((1-x)^6-x^6).
 * @author Sean A. Irvine
 */
public class A192080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192080() {
    super(new long[] {6, -15, 20, -15, 6}, new long[] {1, 6, 21, 56, 126});
  }
}
