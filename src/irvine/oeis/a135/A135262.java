package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135262 <code>a(3n)=10^n</code>. <code>a(3n+1)=4*10^n</code>. <code>a(3n+2)=7*10^n</code>.
 * @author Sean A. Irvine
 */
public class A135262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135262() {
    super(new long[] {10, 0, 0}, new long[] {1, 4, 7});
  }
}
