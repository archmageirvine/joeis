package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072176 Unimodal analog of Fibonacci numbers: a(n+1) = Sum_{k=0..floor(n/2)} A071922(n-k,k).
 * @author Sean A. Irvine
 */
public class A072176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072176() {
    super(1, new long[] {1, -1, -2, 1, 2}, new long[] {1, 1, 2, 3, 5});
  }
}
