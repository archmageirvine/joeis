package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099915 Expansion of (1+4x)/((1-x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A099915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099915() {
    super(new long[] {-10, 11}, new long[] {1, 15});
  }
}
