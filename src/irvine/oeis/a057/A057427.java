package irvine.oeis.a057;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A057427 <code>Sign(n)</code> or <code>signum(n) (with</code> offset <code>0): a(n) = 1</code> if <code>n&gt;0, = 0</code> if <code>n=0, = -1</code> if <code>n&lt;0</code>; series expansion of <code>x/(1-x)</code>.
 * @author Georg Fischer
 */
public class A057427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057427() {
    super(new long[] {0L, 1L}, new long[] {0L, 1L});
  } // constructor()
} // A057427
