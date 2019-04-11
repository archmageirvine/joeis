package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099503 Expansion of <code>1/(1-4x+x^3)</code>.
 * @author Sean A. Irvine
 */
public class A099503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099503() {
    super(new long[] {-1, 0, 4}, new long[] {1, 4, 16});
  }
}
