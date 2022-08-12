package irvine.oeis.a120;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A120596 G.f. satisfies: 6*A(x) = 5 + x + A(x)^5, starting with [1,1,10].
 * <code>holdfin(A120596, 0,-37531*(n-3)*(n-2)*(n-1)*n+781250*(n-1)*(n-2)*(n-3)*(2*n-3)*A+46875*(n-2)*(n-3)*(10*n^2-40*n+39)*A^2+3125*(n-3)*(2*n-5)*(10*n^2-50*n+57)*A^3+5*(5*n-9)*(5*n-13)*(5*n-17)*(5*n-21)*A^4,[1, 1, 10, 210],"a(n)");</code>
 * @author Georg Fischer
 */
public class A120596 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A120596() {
    super(0, "[[0],[208845,-307500, 163750,-37500, 3125],[2671875,-4303125, 2543750,-656250, 62500],[10968750,-20390625, 14015625,-4218750, 468750],[14062500,-35156250, 31250000,-11718750, 1562500],[0, 225186,-412841, 225186,-37531]]", "[1, 1, 10, 210]", 0);
  }
}
