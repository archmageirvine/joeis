package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131756 Period 3: repeat [2, -1, 3].
 * @author Sean A. Irvine
 */
public class A131756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131756() {
    super(new long[] {1, 0, 0}, new long[] {2, -1, 3});
  }
}
