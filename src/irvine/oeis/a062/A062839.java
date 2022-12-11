package irvine.oeis.a062;
// manually anopan 1,2

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a024.A024675;
import irvine.oeis.a028.A028334;

/**
 * A062839 a(n) = floor((prime(n-1)+prime(n+1))/2).
 * @author Georg Fischer
 */
public class A062839 extends AbstractSequence {

  private int mN = -1;
  private final static Z[] INITS = {Z.ONE, Z.THREE};
  private final A024675 mSeq1 = new A024675();
  private final A028334 mSeq2 = new A028334();

  /** Construct the sequence. */
  public A062839() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return (++mN < 2) ? INITS[mN] : mSeq1.next().subtract(mSeq2.next());
  }
}
