package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133464 a(3n)=4^n, a(3n+1)=2*4^n, a(3n+2)=3*4^n.
 * @author Sean A. Irvine
 */
public class A133464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133464() {
    super(new long[] {4, 0, 0}, new long[] {1, 2, 3});
  }
}
