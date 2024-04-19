package irvine.oeis.a213;
// manually anopsn 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007477;

/**
 * A213705 a(n)=n if n &lt;= 3, otherwise a(n) = A007477(n-1) + A007477(n).
 * @author Georg Fischer
 */
public class A213705 extends AbstractSequence {

  private int mN = 0;
  private final A007477 mSeq1 = new A007477();
  private Z mA;

  /** Construct the sequence. */
  public A213705() {
    super(1);
    mSeq1.next();
    mSeq1.next();
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(mN);
    }
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
