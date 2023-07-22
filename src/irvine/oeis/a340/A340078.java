package irvine.oeis.a340;
// manually nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a018.A018804;

/**
 * A340078 a(n) = gcd(n, 1+A018804(n)), where A018804(n) = Sum_{k=1..n} gcd(k, n).
 * @author Georg Fischer
 */
public class A340078 extends AbstractSequence {

  private int mN;
  private A018804 mSeq1 = new A018804() {
    @Override
    public Z next() {
      return super.next().add(1);
    }
  };

  /** Construct the sequence. */
  public A340078() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).gcd(mSeq1.next());
  }
}
