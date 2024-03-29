package irvine.oeis.a193;
// Generated by gen_seq4.pl trigf 1, 0, -1, 0, 0, 0 1, -1, -3, 0, 0, 0 at 2020-02-18 21:32
// gf=1/(1-(1*x+2*x*y)/(1-(+1*x*y)))
// dhdop=[1(, 0)*] DELTA [2, 1(, 0)*]
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A193722 Triangular array: the fusion of (x+1)^n and (x+2)^n; see Comments for the definition of fusion.
 * @author Georg Fischer
 */
public class A193722 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A193722() {
    super(0, new long[] {1, 0, -1, 0, 0, 0}, new long[] {1, -1, -3, 0, 0, 0});
  }
}
