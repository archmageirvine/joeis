package irvine.oeis.a091;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: -(2*x^5+x^2+x+1)/(3*x^3-1)
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A091916 Maximum of odd products of partitions of n.
 * @author Georg Fischer
 */
public class A091916 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A091916() {
    super(0, "[1,1,1,0,0,2]", "[1,0,0,-3]");
  }
}
