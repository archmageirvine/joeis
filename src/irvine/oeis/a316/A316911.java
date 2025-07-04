package irvine.oeis.a316;
// Generated by gen_seq4.pl 2025-06-25.ack/ratos at 2025-06-25 23:22

import irvine.oeis.recur.RationalRecurrence;

/**
 * A316911 Define K(n) = Integral_{t=0..1} (-1/2)^n/(1+t)*((1-t)^2*t^2/(1+t))^n*dt and write K(n) = d(n)*log(2) - a(n)/c(n) where a(n), d(n), c(n) are positive integers; sequence gives a(n).
 * @author Georg Fischer
 */
public class A316911 extends RationalRecurrence {

  /** Construct the sequence. */
  public A316911() {
    super(0, "[[0],[48,-374,918,-856,264],[1440,-11781,31788,-34209,12474],[0,246,-1305,1998,-891]]", "0,25/6", 0, 0);
  }
}
