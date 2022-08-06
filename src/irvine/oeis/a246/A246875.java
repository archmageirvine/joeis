package irvine.oeis.a246;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A246875 a(n) = (Sum_{k=0..n-1} C(n-1,k)^2*C(-n-1,k)^2/C(k+2,2))/n.
 * Recurrence: -n*(n-1)^2*(2*n+3)*a(n) + 4*(17*n^4+68*n^3+92*n^2+48*n+9)*a(n+1) - (n+2)*(n+3)^2*(2*n+1)*a(n+2) = 0.
 * @author Georg Fischer
 */
public class A246875 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A246875() {
    super(1, "[[0],[0,-3, 4, 1,-2],[36, 192, 368, 272, 68],[-18,-57,-50,-17,-2]]", "1", 2);
  }
}
