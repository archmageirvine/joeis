package irvine.oeis.a179;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A179995 Generating function A(5,t)(1+t+t^2)/(1-t)^6, where A(5,t) is an Eulerian polynomial. 
 * @author Georg Fischer
 */
public class A179995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179995() {
    super(new long[] {-1L, 6L, -15L, 20L, -15L, 6L}, new long[] {33L, 276L, 1299L, 4392L, 11925L, 27708L}, new long[] {1L});
  } // constructor()
} // A179995
