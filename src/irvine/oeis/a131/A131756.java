package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131756.
 * @author Sean A. Irvine
 */
public class A131756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131756() {
    super(new long[] {1, 0, 0}, new long[] {2, -1, 3});
  }
}
