package irvine.oeis.a099;
// Generated by gen_seq4.pl trigft/trigf at 2023-10-14 18:42

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A099093 Riordan array (1, 3+3x).
 * @author Georg Fischer
 */
public class A099093 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A099093() {
    super(0, "[1]", "[1,0,-3,0,-3,0,0,0,0,0]");
  }
}
