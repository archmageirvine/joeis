package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099914 Expansion of (1+3x)/((1-x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A099914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099914() {
    super(new long[] {-10, 11}, new long[] {1, 14});
  }
}
