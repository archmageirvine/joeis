package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112685 a(n)=5a(n-2)+2a(n-3).
 * @author Sean A. Irvine
 */
public class A112685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112685() {
    super(new long[] {2, 5, 0}, new long[] {1, 1, 1});
  }
}
