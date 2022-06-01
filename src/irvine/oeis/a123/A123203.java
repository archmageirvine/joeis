package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123203 A007318 * [1, 1, 4, 4, 4, ...].
 * @author Sean A. Irvine
 */
public class A123203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123203() {
    super(new long[] {2, -5, 4}, new long[] {1, 2, 7});
  }
}
