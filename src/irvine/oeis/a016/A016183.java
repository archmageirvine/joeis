package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016183 Expansion of 1/((1-7x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A016183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016183() {
    super(new long[] {-77, 18}, new long[] {1, 18});
  }
}
