package irvine.oeis.a159;
// Generated by gen_seq4.pl trigft at 2023-10-14 16:48

import irvine.oeis.PrependSequence;
import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A159916 Triangle T(m,n) = number of subsets of {1,...,m} with n elements having an odd sum, 1 &lt;= n &lt;= m.
 * @author Georg Fischer
 */
public class A159916 extends PrependSequence {

  /** Construct the sequence. */
  public A159916() {
    super(1, new GeneratingFunctionTriangle(1, "[1]", "[1,-1,-1,-1,0,1,1,1,-1,-1]"), 1);
  }
}
