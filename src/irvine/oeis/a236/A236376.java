package irvine.oeis.a236;
// Generated by gen_seq4.pl trigf 1, -1, 0, 1, 0, 0 1, -2, -1, 1, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A236376 Riordan array ((1-x+x^2)/(1-x)^2, x/(1-x)^2).
 * @author Georg Fischer
 */
public class A236376 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A236376() {
    super(0, new long[] {1, -1, 0, 1, 0, 0}, new long[] {1, -2, -1, 1, 0, 0});
  }
}
