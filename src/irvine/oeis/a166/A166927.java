package irvine.oeis.a166;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A166927 a(n) = 20*a(n-1) - 64*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 18. 
 * @author Georg Fischer
 */
public class A166927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166927() {
    super(new long[] {-64L, 20L}, new long[] {1L, 18L});
  } // constructor()
} // A166927
