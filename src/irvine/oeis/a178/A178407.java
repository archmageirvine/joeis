package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178407 <code>a(n+1) = a(n)*1000 + 101^n</code> with <code>a(0)= 0</code>.
 * @author Sean A. Irvine
 */
public class A178407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178407() {
    super(new long[] {-101000, 1101}, new long[] {0, 1});
  }
}
