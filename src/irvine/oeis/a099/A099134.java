package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099134 Expansion of <code>x/(1-2x-19x^2)</code>.
 * @author Sean A. Irvine
 */
public class A099134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099134() {
    super(new long[] {19, 2}, new long[] {0, 1});
  }
}
