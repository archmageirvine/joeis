package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256233 <code>a(n) = L(2*n+1) - 2</code>, where L is A000032.
 * @author Sean A. Irvine
 */
public class A256233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256233() {
    super(new long[] {1, -4, 4}, new long[] {-1, 2, 9});
  }
}
