package irvine.oeis.a303;
// Generated by gen_seq4.pl trigft/trigf at 2023-10-14 18:42

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A303901 Triangle read by rows of coefficients in expansion of (3-2x)^n, where n is a nonnegative integer.
 * @author Georg Fischer
 */
public class A303901 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A303901() {
    super(0, "[1]", "[1,-3,2,0,0,0,0,0,0,0]");
  }
}
