package irvine.oeis.a164;
// Generated by gen_seq4.pl trigft at 2023-10-14 16:48

import irvine.oeis.PrependSequence;
import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A164915 Inverse of binomial matrix (10^n,1) A164899. (See A164899 for companion sequence.).
 * @author Georg Fischer
 */
public class A164915 extends PrependSequence {

  /** Construct the sequence. */
  public A164915() {
    super(1, new GeneratingFunctionTriangle(1, "[1]", "[1,-1,-10,0,11,0,0,0,-10,0]"), 1);
  }
}
