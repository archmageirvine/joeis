package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138635 a(n) =3*a(n-3)-3*a(n-6)+2*a(n-9).
 * @author Sean A. Irvine
 */
public class A138635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138635() {
    super(new long[] {2, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {0, 0, 1, 0, 1, 1, 1, 2, 1});
  }
}
