package irvine.oeis.a377;
// Generated by gen_seq4.pl 2024-10-25.ack/holos at 2024-10-25 23:02

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A377241 Expansion of 1/sqrt(1 - 4*x*sqrt(1 + 4*x)).
 * 1/(1-4*x*(1+4*x)^(1/2))^(1/2)
 * @author Georg Fischer
 */
public class A377241 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A377241() {
    super(0, "[[0],[17952,-10752,1536],[7440,-5632,1024],[792,-864,224],[-156,100,-8],[-24,34,-10],[0,1,-1]]", "1,2,10,40,198,912,4540", 0, 0);
  }
}
