package irvine.oeis.a026;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026474 a(n) = least positive integer &gt; a(n-1) and not equal to a(i)+a(j) or a(i)+a(j)+a(k) for 1&lt;=i&lt;j&lt;k&lt;n (a 3-Stohr sequence).
 * @author Georg Fischer
 */
public class A026474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026474() {
    super(1, new long[] {-1L, 2L}, new long[] {8L, 15L}, 1L, 2L, 4L);
  } // constructor()
} // A026474
