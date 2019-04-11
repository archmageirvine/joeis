package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016174 Expansion of <code>1/((1-6x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A016174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016174() {
    super(new long[] {-66, 17}, new long[] {1, 17});
  }
}
