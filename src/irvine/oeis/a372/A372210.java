package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-06-09/holos at 2024-06-09 23:02

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A372210 Product of n!, n-th Pell number and n-th harmonic number.
 * Recurrence: 8*a(n)+16*(-2*n+1)*a(n-1)+(16*n^2-32*n+25)*a(n-2)+4*(8*n^3-36*n^2+47*n-13)*a(n-3)+2*(2*n-5)*(2*n^3-11*n^2+17*n-7)*a(n-4)+4*(n-4)^3*a(n-5)+(n-4)^2*(n-5)^2*a(n-6)=0
 * @author Georg Fischer
 */
public class A372210 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A372210() {
    super(1, "[[0], [400, -360, 121, -18, 1], [-256, 192, -48, 4], [70, -198, 178, -64, 8], [-52, 188, -144, 32], [25, -32, 16], [16, -32], [8]]", "[1, 6, 55, 600, 7946, 123480]", 0, 0);
  }
}
