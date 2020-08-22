package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135520 a(n) = 4*a(n-2).
 * @author Sean A. Irvine
 */
public class A135520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135520() {
    super(new long[] {4, 0}, new long[] {2, 1});
  }
}
