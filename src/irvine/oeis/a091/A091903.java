package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091903 Expansion of x/((1+5x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A091903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091903() {
    super(new long[] {50, 5}, new long[] {0, 1});
  }
}
