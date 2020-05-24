package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085441 <code>a(n) = Sum_{i=1..n} binomial(i+1,2)^6</code>.
 * @author Sean A. Irvine
 */
public class A085441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085441() {
    super(new long[] {-1, 14, -91, 364, -1001, 2002, -3003, 3432, -3003, 2002, -1001, 364, -91, 14}, new long[] {1, 730, 47386, 1047386, 12438011, 98204132, 580094436, 2756876772L, 11060642397L, 38741283022L, 121395233038L, 346594833742L, 914464085783L, 2254559726408L});
  }
}
