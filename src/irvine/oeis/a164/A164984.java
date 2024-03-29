package irvine.oeis.a164;
// Generated by gen_seq4.pl trigft at 2023-10-14 16:48

import irvine.oeis.PrependSequence;
import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A164984 Odd (Jacobsthal) triangle.
 * @author Georg Fischer
 */
public class A164984 extends PrependSequence {

  /** Construct the sequence. */
  public A164984() {
    super(1, new GeneratingFunctionTriangle(1, "[1]", "[1,-1,-1,-2,-1,0,0,0,0,0]"), 1);
  }
}
