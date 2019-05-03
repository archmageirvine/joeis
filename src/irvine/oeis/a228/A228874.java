package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228874 <code>L(n) * L(n+1) * L(n+2) * L(n+3)</code>, the product of four consecutive Lucas numbers, <code>A000032</code>.
 * @author Sean A. Irvine
 */
public class A228874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228874() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {24, 84, 924, 5544, 40194});
  }
}
