package irvine.oeis.a290;
// manually robots/m1pow at 2023-08-09 22:01

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007814;
import irvine.oeis.a064.A064989;

/**
 * A290099 Multiplicative with a(2^e) = (-1)^e and a(p^e) = prevprime(p)^e for odd primes p.
 * @author Georg Fischer
 */
public class A290099 extends AbstractSequence {

  private final A007814 mSeq1 = new A007814();
  private final A064989 mSeq2 = new A064989();

  /** Construct the sequence. */
  public A290099() {
    super(1);
  }

  @Override
  public Z next() {
    return (mSeq1.next().testBit(0) ? Z.NEG_ONE : Z.ONE).multiply(mSeq2.next());
  }
}
