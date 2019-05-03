package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158003 <code>a(n) = 196*n^2 -</code> n.
 * @author Sean A. Irvine
 */
public class A158003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158003() {
    super(new long[] {1, -3, 3}, new long[] {195, 782, 1761});
  }
}
