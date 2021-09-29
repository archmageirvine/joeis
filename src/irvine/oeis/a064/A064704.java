package irvine.oeis.a064;
// manually 2021-09-29

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A064704 Numbers beginning and ending with their multiplicative digital root. 
 * @author Georg Fischer
 */
public class A064704 implements Sequence {

  protected long mN;

  /** Construct the sequence. */
  public A064704() {
    mN = 0;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long root = ZUtils.digitProductRoot(mN);
      if (mN % 10 == root) {
        if (String.valueOf(mN).charAt(0) - '0' == root) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
