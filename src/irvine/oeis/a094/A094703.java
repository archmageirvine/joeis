package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094703 <code>a(1)=1, a(2)=11, a(n+2) = 8*a(n+1) + 21*a(n)</code>.
 * @author Sean A. Irvine
 */
public class A094703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094703() {
    super(new long[] {21, 8}, new long[] {1, 11});
  }
}
