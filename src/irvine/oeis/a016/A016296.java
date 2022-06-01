package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016296 Expansion of 1/((1-2x)(1-5x)(1-7x)).
 * @author Sean A. Irvine
 */
public class A016296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016296() {
    super(new long[] {70, -59, 14}, new long[] {1, 14, 137});
  }
}
