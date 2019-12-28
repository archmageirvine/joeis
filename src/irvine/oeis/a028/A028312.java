package irvine.oeis.a028;

import java.util.BitSet;
import java.util.List;

import irvine.math.z.Z;

/**
 * A028312.
 * @author Sean A. Irvine
 */
public class A028312 extends A028311 {

  // Could be done with complement on A028311.

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final List<BitSet> cosets = cosets(mN);
      if (!isA028311(cosets)) {
        return Z.valueOf(mN);
      }
    }
  }
}
