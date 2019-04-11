package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099531 Expansion of <code>(1+x)^3/((1+x)^3+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A099531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099531() {
    super(new long[] {-1, -1, -3, -3}, new long[] {1, 0, 0, 0});
  }
}
