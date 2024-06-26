package irvine.oeis.a364;
// Generated by gen_seq4.pl nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a243.A243071;

/**
 * A364256 a(n) = gcd(n, A243071(n)).
 * @author Georg Fischer
 */
public class A364256 extends AbstractSequence {

  private int mN;
  private final A243071 mSeq1 = new A243071();

  /** Construct the sequence. */
  public A364256() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).gcd(mSeq1.next());
  }
}
