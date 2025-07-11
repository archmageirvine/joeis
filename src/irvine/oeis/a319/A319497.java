package irvine.oeis.a319;
// Generated by gen_seq4.pl 2025-07-08.ack/multia at 2025-07-08 21:48

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A319497 a(0)=0, a(3*n)=9*a(n), a(3*n+1)=9*a(n)+1, a(3*n+2)=9*a(n)+3.
 * @author Georg Fischer
 */
public class A319497 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A319497() {
    super(0, (self, n) -> n % 3 == 0 ? self.a(n / 3).multiply(9) : (n % 3 == 1 ? self.a(n / 3).multiply(9).add(1) : self.a(n / 3).multiply(9).add(3)), "0, 1, 3");
  }
}
