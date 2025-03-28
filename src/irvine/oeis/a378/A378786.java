package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-01-27.ack/holos at 2025-01-27 21:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A378786 G.f. A(x) satisfies A(x) = 1 + x * (1+x)^2 * A(x)^4.
 * G.f.A(x) satisfies -A+1+x*(1+x)^2*A^4=0
 * @author Georg Fischer
 */
public class A378786 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A378786() {
    super(0, "[[0],[-376200,207792,-38016,2304],[-1232640,760992,-156672,10752],[-1496520,1062224,-253056,20224],[-794700,680483,-196764,19213],[-157968,182070,-70866,9336],[-2724,9842,-8076,1966],[264,-706,426,40],[0,3,0,-27]]", "1,1,6", 0, 0);
  }
}
