package irvine.oeis.a337;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A337900 The number of walks of length 2n on the square lattice that start from the origin (0,0) and end at the vertex (2,0).
 * Recurrence: (n-1)^2*(n+1)^2*a(n)-4*n^2*(2*n-1)^2*a(n-1)=0
 * @author Georg Fischer
 */
public class A337900 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A337900() {
    super(1, "[[0],[0, 0, 4,-16, 16],[-1, 0, 2, 0,-1]]", "1, 16, 225, 3136, 44100, 627264, 9018009", 0);
  }
}
