package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123138 The n-th digit of a(n-1) gives the position of digit n in a(n), a(1)=263514.
 * @author Sean A. Irvine
 */
public class A123138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123138() {
    super(new long[] {1, 0}, new long[] {263514, 513642});
  }
}
