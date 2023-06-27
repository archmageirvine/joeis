package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135214 a(1)=1, a(n) = a(n-1) + n^5 if n odd, a(n) = a(n-1) + n^4 if n is even.
 * @author Sean A. Irvine
 */
public class A135214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135214() {
    super(1, new long[] {1, -1, -6, 6, 15, -15, -20, 20, 15, -15, -6, 6, 1}, new long[] {1, 17, 260, 516, 3641, 4937, 21744, 25840, 84889, 94889, 255940, 276676, 647969});
  }
}
