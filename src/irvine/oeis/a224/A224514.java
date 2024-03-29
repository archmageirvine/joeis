package irvine.oeis.a224;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A224514 Expansion of (1-x)*(1-3*x)*(1-3*x+x^2)/(1-9*x+28*x^2-35*x^3+15*x^4-x^5).
 * @author Georg Fischer
 */
public class A224514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224514() {
    super(new long[] {1L, -15L, 35L, -28L, 9L}, new long[] {44744L, 164407L, 604487L, 2223504L, 8181175L}, 1L, 2L, 6L, 20L, 70L, 251L, 911L, 3327L, 12190L);
  } // constructor()
} // A224514
