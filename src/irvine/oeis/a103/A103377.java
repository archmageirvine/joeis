package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103377 a(1)=a(2)=...=a(10)=1, a(n)=a(n-9)+a(n-10).
 * @author Sean A. Irvine
 */
public class A103377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103377() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
