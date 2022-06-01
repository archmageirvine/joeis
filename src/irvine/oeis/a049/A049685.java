package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049685 a(n) = L(4*n+2)/3, where L=A000032 (the Lucas sequence).
 * @author Sean A. Irvine
 */
public class A049685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049685() {
    super(new long[] {-1, 7}, new long[] {1, 6});
  }
}
