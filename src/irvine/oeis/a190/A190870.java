package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190870 a(n) = 11*a(n-1) - 22*a(n-2), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190870() {
    super(new long[] {-22, 11}, new long[] {0, 1});
  }
}
