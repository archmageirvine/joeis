package irvine.oeis.a339;
// Generated by gen_seq4.pl nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005940;

/**
 * A339969 a(n) = gcd(n, A005940(1+n)).
 * @author Georg Fischer
 */
public class A339969 extends AbstractSequence {

  private int mN;
  private final A005940 mSeq1 = new A005940();

  /** Construct the sequence. */
  public A339969() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).gcd(mSeq1.next());
  }
}
