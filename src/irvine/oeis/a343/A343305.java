package irvine.oeis.a343;
// Generated by gen_seq4.pl satishol/holos at 2023-01-10 22:13

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A343305 a(0) = ... = a(3) = 1; a(n) = a(n-4) + Sum_{k=0..n-5} a(k) * a(n-k-5).
 * @author Georg Fischer
 */
public class A343305 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A343305() {
    super(0, "[[0],[468,-75,3],[1272,-226,10],[2112,-423,21],[3480,-828,48],[3924,-1107,75],[3336,-1156,94],[2280,-1035,105],[1128,-676,88],[324,-297,57],[48,-78,30],[24,11,7],[96,32,-8],[84,7,-7],[48,-12,-6],[0,-25,-5]]", "[1,1,1,1,1,2,3,4,5,7,11,17,25,36]", 0);
  }
}
