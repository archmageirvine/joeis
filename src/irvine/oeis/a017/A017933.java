package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017933 Expansion of <code>1/((1-3x)(1-6x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A017933 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017933() {
    super(new long[] {162, -99, 18}, new long[] {1, 18, 225});
  }
}
