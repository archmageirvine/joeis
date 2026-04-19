package irvine.oeis.a084;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000265;

/**
 * A084458 An infinite juggling sequence using three balls: a(n) is the least (lowest) throw needed to ensure that none of the juggling states A084457[n..n+A006519(n)-1] occurs in A084457[0..n-1].
 * @author Sean A. Irvine
 */
public class A084458 extends Sequence1 {

  private final DirectSequence mR = new A000265();
  private final HashSet<Long> mSeen = new HashSet<>();
  private Z mA = Z.SEVEN;
  {
    mSeen.add(7L);
  }
  private int mBit = 3;

  @Override
  public Z next() {
    long res = 0;
    if (Z.SEVEN.equals(mA)) {
      // starting new block
      while (mSeen.contains(mR.a(mA.setBit(mBit).divide2().longValueExact()).longValueExact())) {
        ++mBit;
      }
      mA = mA.setBit(mBit);
      res = mBit;
    } else if (mA.testBit(0)) {
      // current value is odd
      int b = 0;
      while (mA.testBit(b) || mSeen.contains(mR.a(mA.setBit(b).divide2().longValueExact()).longValueExact())) {
        ++b;
      }
      mA = mA.setBit(b);
      res = b;
    }
    mA = mA.divide2();
    mSeen.add(mA.longValueExact());
    return Z.valueOf(res);
  }
}
