package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103377 <code>a(1)=a(2)=...=a(10)=1, a(n)=a(n-9)+a(n-10)</code>.
 * @author Sean A. Irvine
 */
public class A103377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103377() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
