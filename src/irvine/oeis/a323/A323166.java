package irvine.oeis.a323;
// Generated by gen_seq4.pl robot/nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a034.A034448;

/**
 * A323166 Greatest common divisor of Product (1+(p_i^e_i)) and n, when n = Product (p_i^e_i); a(n) = gcd(A034448(n), n).
 * @author Georg Fischer
 */
public class A323166 extends AbstractSequence {

  private int mN;
  private final A034448 mSeq1 = new A034448();

  /** Construct the sequence. */
  public A323166() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).gcd(mSeq1.next());
  }
}
