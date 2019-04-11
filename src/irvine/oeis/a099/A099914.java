package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099914 Expansion of <code>(1+3x)/((1-x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A099914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099914() {
    super(new long[] {-10, 11}, new long[] {1, 14});
  }
}
