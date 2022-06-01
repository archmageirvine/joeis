package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016150 Expansion of 1/((1-4x)(1-7x)).
 * @author Sean A. Irvine
 */
public class A016150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016150() {
    super(new long[] {-28, 11}, new long[] {1, 11});
  }
}
