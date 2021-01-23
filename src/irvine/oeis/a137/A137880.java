package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137880 Indices n of perfect squares among 17-gonal numbers A051869(n) = n(15n - 13)/2.
 * @author Sean A. Irvine
 */
public class A137880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137880() {
    super(new long[] {1, -1, -482, 482, 1}, new long[] {1, 49, 225, 23409, 108241});
  }
}
