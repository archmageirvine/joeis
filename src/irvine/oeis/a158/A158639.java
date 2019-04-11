package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158639 <code>a(n) = 676*n^2 - 26</code>.
 * @author Sean A. Irvine
 */
public class A158639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158639() {
    super(new long[] {1, -3, 3}, new long[] {650, 2678, 6058});
  }
}
