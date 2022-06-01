package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016175 Expansion of 1/((1-6x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016175() {
    super(new long[] {-72, 18}, new long[] {1, 18});
  }
}
