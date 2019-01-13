package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072251.
 * @author Sean A. Irvine
 */
public class A072251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072251() {
    super(new long[] {16, -24, 9}, new long[] {15, 45, 117});
  }
}
