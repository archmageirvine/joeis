package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099841 Expansion of (1-16*x)/(1-20*x+80*x^2).
 * @author Sean A. Irvine
 */
public class A099841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099841() {
    super(new long[] {-80, 20}, new long[] {1, 4});
  }
}
