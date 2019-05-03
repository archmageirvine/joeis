package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059841 Period <code>2</code>: Repeat <code>[1,0]. a(n) = 1 - (n mod 2)</code>.
 * @author Sean A. Irvine
 */
public class A059841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059841() {
    super(new long[] {1, 0}, new long[] {1, 0});
  }
}
