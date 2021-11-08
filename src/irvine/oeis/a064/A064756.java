package irvine.oeis.a064;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A064756 a(n) = n*10^n - 1.
 * Maple: <code>k:= 10; f:= gfun:-rectoproc({1 + (k-1)*n + k*n*a(n-1) - (n-1)*a(n) = 0, a(1) = k-1}, a(n), remember): map(f, [$1..20]);</code>
 *
 * @author Georg Fischer
 */
public class A064756 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A064756() {
    super(1, "[[1, 9],[0, 10],[1,-1]]", "[9]", 0);
  }
}
