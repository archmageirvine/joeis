package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021184 Expansion of 1/((1-x)*(1-2*x)*(1-6*x)*(1-8*x)).
 * @author Sean A. Irvine
 */
public class A021184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021184() {
    super(new long[] {-96, 172, -92, 17}, new long[] {1, 17, 197, 1957});
  }
}
