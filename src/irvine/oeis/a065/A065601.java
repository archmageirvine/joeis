package irvine.oeis.a065;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A065601 Number of Dyck paths of length 2n with exactly 1 hill.
 * Recurrence: -2*(3*n-4)*(n+1)*a(n)+(n-2)*(21*n-4)*a(n-1)+2*(3*n-1)*(2*n-1)*a(n-2) = 0.
 * @author Georg Fischer
 */
public class A065601 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A065601() {
    super(0, "[[0],[2,-10,12],[8,-46,21],[8,2,-6]]", "[0,1]", 0);
  }
}
