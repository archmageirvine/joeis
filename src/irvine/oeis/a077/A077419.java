package irvine.oeis.a077;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A077419 Largest Whitney number of Fibonacci lattices J(Z_n).
 * @author Georg Fischer
 */
public class A077419 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A077419() {
    // (n^3-20*n^2+135*n-324)*a(n-8)+(-2*n^3+36*n^2-226*n+488)*a(n-6)+(-n^3+16*n^2-95*n+208)*a(n-4)
    // +(-2*n^3+28*n^2-134*n+204)*a(n-2)+(-2*n^2+26*n-80)*a(n-7)+(2*n^2-22*n+64)*a(n-5)+(-6*n^2+74*n-272)*a(n-3)
    // +(12*n-96)*a(n-1)+(n^3-12*n^2+35*n+48)*a(n) = 0
    super(0, "[[0],[-324,135,-20,1],[-80,26,-2],[488,-226,36,-2],[64,-22,2],[208,-95,16,-1],[-272,74,-6],[204,-134,28,-2],[-96,12],[48,35,-12,1]", "1,1,1,2,2,3", 0);
  }
}
