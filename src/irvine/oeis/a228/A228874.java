package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228874 a(n) = L(n) * L(n+1) * L(n+2) * L(n+3), the product of four consecutive Lucas numbers, A000032.
 * @author Sean A. Irvine
 */
public class A228874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228874() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {24, 84, 924, 5544, 40194});
  }
}
