package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178407 a(n+1) = a(n)*1000 + 101^n with a(0)= 0.
 * @author Sean A. Irvine
 */
public class A178407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178407() {
    super(new long[] {-101000, 1101}, new long[] {0, 1});
  }
}
