package irvine.oeis.a238;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A238541 A fourth-order linear divisibility sequence: <code>a(n) := A(n)/A(1)</code> where <code>A(n) := ( (3^n + 2^n)*(3^(3*n) - 2^(3*n)) )</code>.
 * @author Georg Fischer
 */
public class A238541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238541() {
    super(new long[] {-1679616L, 226800L, -10158L, 175L}, new long[] {1L, 91L, 7063L, 538447L});
  } // constructor()
} // A238541
