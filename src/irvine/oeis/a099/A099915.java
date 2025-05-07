package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099915 Expansion of g.f. (1+4*x)/((1-x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A099915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099915() {
    super(new long[] {-10, 11}, new long[] {1, 15});
  }
}
