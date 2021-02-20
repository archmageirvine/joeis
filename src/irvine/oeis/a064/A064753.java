package irvine.oeis.a064;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A064753 a(n) = n*7^n - 1.
 * Maple: k:= 7; f:= gfun:-rectoproc({1 + (k-1)*n + k*n*a(n-1) - (n-1)*a(n) = 0, a(1) = k-1}, a(n), remember): map(f, [$1..20]);
 *
 * @author Georg Fischer
 */
public class A064753 extends HolonomicRecurrence {

  /**
   * Construct the sequence.
   */
  public A064753() {
    super(1, "[[1, 6],[0, 7],[1,-1]]", "[6]", 0);
  }
}
