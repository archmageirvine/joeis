package irvine.oeis.a080;
// Generated by gen_seq4.pl 2024-11-27.ack/mulr at 2024-11-27 22:04

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A080736 Multiplicative function defined by a(1)=1, a(2)=0, a(2^r) = phi(2^r) (r&gt;1), a(p^r) = phi(p^r) (p odd prime, r&gt;=1), where phi is Euler's function A000010.
 * Multiplicative with: a(2) = 0, a(2^e) = 2^(e-1) for e >= 2, and a(p^e) = (p-1)*p^(e-1) for an odd prime p.
 * @author Georg Fischer
 */
public class A080736 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A080736() {
    super(1, (p, e) -> p.equals(Z.TWO) ? ((e == 1) ? Z.ZERO : Z.TWO.pow(e - 1)) : p.subtract(1).multiply(p.pow(e - 1)));
  }
}
