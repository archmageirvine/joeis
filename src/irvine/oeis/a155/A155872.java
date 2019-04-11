package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155872 <code>a(n) = 10^n + 11^n</code>.
 * @author Sean A. Irvine
 */
public class A155872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155872() {
    super(new long[] {-110, 21}, new long[] {2, 21});
  }
}
