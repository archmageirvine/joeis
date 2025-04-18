package irvine.oeis.a078;
// Generated by gen_seq4.pl 2025-02-10.ack/holos at 2025-02-10 21:26

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A078995 a(n) = Sum_{k=0..n} C(4*k,k)*C(4*(n-k),n-k).
 * 
 * @author Georg Fischer
 */
public class A078995 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A078995() {
    super(0, "[[0],[-276480, 1511424,-2752512, 2031616,-524288],[29160,-176304, 378624,-345600, 110592],[0, 1782,-9315, 13851,-5832]]", "1, 8", 0, 0);
  }
}
