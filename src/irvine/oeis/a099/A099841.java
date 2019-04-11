package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099841 Expansion of <code>(1-16x)/(1-20x+80x^2)</code>.
 * @author Sean A. Irvine
 */
public class A099841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099841() {
    super(new long[] {-80, 20}, new long[] {1, 4});
  }
}
