package irvine.oeis.a064;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A064757 a(n) = n*11^n - 1.
 * Maple: <code>k:= 11; f:= gfun:-rectoproc({1 + (k-1)*n + k*n*a(n-1) - (n-1)*a(n) = 0, a(1) = k-1}, a(n), remember): map(f, [$1..20]);</code>
 *
 * @author Georg Fischer
 */
public class A064757 extends HolonomicRecurrence {

  /**
   * Construct the sequence.
   */
  public A064757() {
    super(1, "[[1, 10],[0, 11],[1,-1]]", "[10]", 0);
  }
}
