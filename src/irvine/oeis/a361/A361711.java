package irvine.oeis.a361;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A361711 a(1) = 1 and a(n) = Sum_{k = 0..n-2} (-1)^k * binomial(n,k)^2 * binomial(n-2,k) for n &gt;= 2.
 * @author Georg Fischer
 */
public class A361711 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A361711() {
    // -n^2*(n-2)*(3*n^2-14*n+17)*a(n)  -6*(6*n^3-24*n^2+29*n-9)*a(n-1) - 3*(n-3)*(3*n-4)*(3*n-5)*(3*n^2-8*n+6)*a(n-2) with a(1) = a(2) = 1
    super(1, "[[0],[1080,-3258,3936,-2367,702,-81],[54,-174,144,-36],[0,0,34,-45,20,-3]]", "1,1", 0);
  }
}
