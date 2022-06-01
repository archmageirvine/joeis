package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017933 Expansion of 1/((1-3x)(1-6x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A017933 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017933() {
    super(new long[] {162, -99, 18}, new long[] {1, 18, 225});
  }
}
