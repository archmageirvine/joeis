package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091883 Expansion of (1-5x)/((1+5x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A091883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091883() {
    super(new long[] {50, 5}, new long[] {1, 0});
  }
}
