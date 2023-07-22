package irvine.oeis.a069;
// manually nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000051;

/**
 * A069226 a(n) = gcd(n, 2^n + 1).
 * @author Georg Fischer
 */
public class A069226 extends AbstractSequence {

  private int mN;
  private A000051 mSeq1 = new A000051();

  /** Construct the sequence. */
  public A069226() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).gcd(mSeq1.next());
  }
}
