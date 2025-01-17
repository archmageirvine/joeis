package irvine.oeis.a271;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.a169.A169985;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A271355 Triangular array: T(n,k) = |round((r^n)*(s^k))|, where r = golden ratio = (1+sqrt(5))/2, s = (1-sqrt(5))/2, 1 &lt;= k &lt;= n, n &gt;= 1.
 * @author Georg Fischer
 */
public class A271355 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A271355() {
    super(1, new A169985());
  }
}

