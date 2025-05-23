package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-04-20.ack/holos at 2025-04-20 22:06

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A378474 The number of n-colorings of the vertices of the truncated cuboctahedron up to rotation and reflection.
 * -48*a(n) + (n^48 + 19*n^24 + 8*n^16 + 12*n^12 + 8*n^8)
 * @author Georg Fischer
 */
public class A378474 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A378474() {
    super(0, "[[0,0,0,0,0,0,0,0,8,0,0,0,12,0,0,0,8,0,0,0,0,0,0,0,19,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],[-48]]", "0", 0, 0);
  }
}
