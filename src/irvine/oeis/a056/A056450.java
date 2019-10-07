package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056450 <code>a(n) = (3*2^n - (-2)^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A056450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056450() {
    super(new long[] {4, 0}, new long[] {1, 4});
  }
}
