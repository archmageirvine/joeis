package irvine.oeis.a248;
// manually hygeom at 2022-08-06 15:16

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A248586 a(n)= Sum_{i=0..n} C(n,i)*C(2i,i)^2.
 * n^2*a(n) +(-19*n^2+19*n-5)*a(n-1) +35*(n-1)^2*a(n-2) -17*(n-1)*(n-2)*a(n-3)=0. (Munarini)
 * @author Georg Fischer
 */
public class A248586 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A248586() {
    super(0, "[[0],[-34, 51,-17],[35,-70, 35],[-5, 19,-19],[0, 0, 1]]", "1", 0);
  }
}
