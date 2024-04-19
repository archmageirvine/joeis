package irvine.oeis.a345;
// manually nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a344.A344005;

/**
 * A345993 Let m = A344005(n) = smallest m such that n divides m*(m+1); a(n) = gcd(n,m+1).
 * @author Georg Fischer
 */
public class A345993 extends AbstractSequence {

  private int mN;
  private final A344005 mSeq1 = new A344005() {
    @Override
    public Z next() {
      return super.next().add(1);
    }
  };

  /** Construct the sequence. */
  public A345993() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).gcd(mSeq1.next());
  }
}
