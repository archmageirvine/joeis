package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199685 <code>a(n) = 5*10^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199685() {
    super(new long[] {-10, 11}, new long[] {6, 51});
  }
}
