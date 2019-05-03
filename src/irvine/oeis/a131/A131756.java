package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131756 Period <code>3</code>: repeat <code>[2, -1, 3]</code>.
 * @author Sean A. Irvine
 */
public class A131756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131756() {
    super(new long[] {1, 0, 0}, new long[] {2, -1, 3});
  }
}
