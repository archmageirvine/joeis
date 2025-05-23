package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-04-20.ack/holos at 2025-04-20 22:06

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A378473 The number of n-colorings of the vertices of the truncated octahedron up to rotation and reflection.
 * -48*a(n) + (n^24 + 3*n^16 + 16*n^12 + 8*n^8 + 12*n^6 + 8*n^4)
 * @author Georg Fischer
 */
public class A378473 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A378473() {
    super(0, "[[0,0,0,0,8,0,12,0,8,0,0,0,16,0,0,0,3,0,0,0,0,0,0,0,1],[-48]]", "0", 0, 0);
  }
}
