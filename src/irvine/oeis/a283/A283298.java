package irvine.oeis.a283;
// manually 2022-08-24

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A283298 Diagonal of the Euler-Seidel matrix for the Catalan numbers.
 * Recurrence: 2*n*(2*n+1)*(9*n-11)*a(n) +(-711*n^3+1589*n^2-986*n+144)*a(n-1) -10*(n-1)*(9*n-2)*(2*n-3)*a(n-2)=0.
 * @author Georg Fischer
 */
public class A283298 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A283298() {
    super(0, "[[0],[60,-370, 490,-180],[144,-986, 1589,-711],[0,-22,-26, 36]]", "1", 0);
  }
}
