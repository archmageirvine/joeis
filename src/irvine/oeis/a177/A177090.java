package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177090 a(n) = a(n-1) + 12*100^(n-1), with a(0)=0.
 * @author Sean A. Irvine
 */
public class A177090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177090() {
    super(new long[] {-100, 101}, new long[] {0, 12});
  }
}
