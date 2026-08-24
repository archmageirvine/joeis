package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135520 a(n) = 4*a(n-2) starting with a(0)=2 and a(1)=1.
 * @author Sean A. Irvine
 */
public class A135520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135520() {
    super(new long[] {4, 0}, new long[] {2, 1});
  }
}
