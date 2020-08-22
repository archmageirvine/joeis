package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001592 Hexanacci numbers: a(n+1) = a(n)+...+a(n-5) with a(0)=...=a(4)=0, a(5)=1.
 * @author Sean A. Irvine
 */
public class A001592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001592() {
    super(new long[] {1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 1});
  }
}
