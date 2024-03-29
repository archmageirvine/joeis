package irvine.oeis.a123;
// Generated by gen_seq4.pl trigft/trigf at 2023-10-14 18:42

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A123965 Triangle read by rows: T(0,0)=1; T(n,k) is the coefficient of x^k in the polynomial (-1)^n*p(n,x), where p(n,x) is the characteristic polynomial of the n X n tridiagonal matrix with 3's on the main diagonal and -1's on the super- and subdiagonal (n &gt;= 1; 0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A123965 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A123965() {
    super(0, "[1]", "[1,-3,1,1,0,0,0,0,0,0]");
  }
}
