package irvine.oeis.a203;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A203136 Indices of decagonal numbers that are also hexagonal.
 * @author Sean A. Irvine
 */
public class A203136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203136() {
    super(new long[] {1, -35, 35}, new long[] {1, 20, 667});
  }
}
