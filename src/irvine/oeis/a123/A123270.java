package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123270 a(0)=1, a(1)=1, a(n)=5*a(n-1)+4*a(n-2).
 * @author Sean A. Irvine
 */
public class A123270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123270() {
    super(new long[] {4, 5}, new long[] {1, 1});
  }
}
