package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063657 Numbers with property that truncated square root is unequal to rounded square root.
 * Also: skip 1, take 0, skip 2, take 1, skip 3, take 2, -&gt; (3, 7, 8, 13, 14, 15, 21, 22)
 * @author Georg Fischer
 */
public class A063657 extends Sequence1 {

  private long mN = 2;
  private long mS = 2;
  private long mT = 1;

  @Override
  public Z next() {
    if (mT == 0) {
      mN += ++mS;
      mT = mS - 1;
    }
    --mT;
    return Z.valueOf(++mN);
  }
}
