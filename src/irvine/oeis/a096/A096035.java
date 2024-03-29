package irvine.oeis.a096;
// Generated by gen_seq4.pl trigft at 2023-10-14 16:48

import irvine.oeis.PrependSequence;
import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A096035 Triangle read by rows: T(n,k) = (n+1,k)-th element of (M^4-M)/3, where M is the infinite lower Pascal's triangle matrix, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A096035 extends PrependSequence {

  /** Construct the sequence. */
  public A096035() {
    super(1, new GeneratingFunctionTriangle(1, "[1]", "[1,-5,-2,4,5,1,0,0,0,0]"), 1);
  }
}
