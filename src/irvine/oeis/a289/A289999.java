package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289999 Sierpinski cuboctahedral numbers: a(n) = 16*4^n - 12*2^n + 9.
 * @author Sean A. Irvine
 */
public class A289999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289999() {
    super(new long[] {8, -14, 7}, new long[] {13, 49, 217});
  }
}
