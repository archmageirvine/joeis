package irvine.oeis.a074;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A074086 Coefficient of q^3 in nu(n), where nu(0)=1, nu(1)=b and, for n&gt;=2, nu(n)=b*nu(n-1)+lambda*(1+q+q^2+...+q^(n-2))*nu(n-2) with (b,lambda)=(2,1).
 * @author Georg Fischer
 */
public class A074086 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A074086() {
    super(0, new long[] {0, 0, 0, 0, 0, 14, -41, -6, 49, 30, 5},
      new long[] {1, -8, 20, -8, -26, 8, 20, 8, 1});
  }
}
