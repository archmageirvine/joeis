package irvine.oeis.a064;
// manually 2021-09-29

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A064807 Numbers which are divisible by their digital root (A010888). 
 * @author Georg Fischer
 */
public class A064807 implements Sequence {

  protected long mN;

  /** Construct the sequence. */
  public A064807() {
    mN = 0;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN % ZUtils.digitSumRoot(mN) == 0L) {
        return Z.valueOf(mN);
      }
    }
  }
}
