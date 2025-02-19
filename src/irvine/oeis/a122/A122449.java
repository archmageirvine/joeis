package irvine.oeis.a122;
// Generated by gen_seq4.pl 2024-10-02.ack/holos at 2024-10-02 22:45

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A122449 Diagonal elements A122445(n+2,n) of the pendular trinomial triangle A122445.
 * FindRE(2/(1-2*x-2*x^2-2*x^3+4*x^4+4*x^5 +(1+2*x^2+2*x^3)*sqrt(1 - 4*x - 4*x^2 + 4*x^4)), x, a(n));
 * @author Georg Fischer
 */
public class A122449 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A122449() {
    super(0, "[[0], [12000, -3600, 240], [34624, -11784, 872], [24904, -10104, 832], [-16392, 7116, -748], [-33324, 18096, -2116], [-17784, 10842, -1402], [-4032, 1080, 104], [-652, -849, 507], [56, -108, 158], [96, -18, -14], [0, -24, -8]]", "1", 0, 0);
  }
}
