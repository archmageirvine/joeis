package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141038 Padovan-like sequence; <code>a(0)=2, a(1)=1, a(2)=1, a(n) = a(n-2) + a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A141038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141038() {
    super(new long[] {1, 1, 0}, new long[] {2, 1, 1});
  }
}
