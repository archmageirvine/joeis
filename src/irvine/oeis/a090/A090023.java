package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090023.
 * @author Sean A. Irvine
 */
public class A090023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090023() {
    super(new long[] {192, -424, 330, -115, 18}, new long[] {0, 1, 37, 415, 3745});
  }
}
