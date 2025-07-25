package irvine.oeis.a272;
// Generated by gen_seq4.pl 2025-07-06.ack/holos at 2025-07-06 20:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A272637 a(1)=1, a(2)=82; thereafter a(n) = squarefree part of a(n-1)+a(n-2).
 * @author Georg Fischer
 */
public class A272637 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A272637() {
    super(1, "[0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1]", "1,83,21,26,47,73,30,103,133,59,3,62,65,127,3,130,133,263,11,274,285,559,211,770,109,879,247,1126,1373,51,89,35,31,66,97,163,65,57,122,179,301,30,331", 0, 0);
  }
}
