package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014098 a(n)=a(n-1)+a(n-4).
 * @author Sean A. Irvine
 */
public class A014098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014098() {
    super(new long[] {1, 0, 0, 1}, new long[] {1, 1, 1, 4});
  }
}
