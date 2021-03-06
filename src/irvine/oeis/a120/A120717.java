package irvine.oeis.a120;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A120717 Expansion of -x*(378*x^3+287*x^2-134*x-67) / ((2*x+1)*(3*x-1)*(10*x^2+5*x-1)).
 * @author Georg Fischer
 */
public class A120717 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A120717() {
    super(0, new long[] {0, 67, 134, -287, -378},
      new long[] {1, -6, -11, 40, 60});
  }
}
