package irvine.oeis.a086;

import irvine.math.group.SymmetricGroup;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A086642 Maximal number of zeros in a column of the character table of the symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A086642 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final DynamicIntArray counts = new DynamicIntArray();
    for (final Z[] t : SymmetricGroup.create(mN).characterTable()) {
      for (int k = 0; k < t.length; ++k) {
        if (t[k].isZero()) {
          counts.increment(k);
        }
      }
    }
    int max = 0;
    for (int k = 0; k < counts.length(); ++k) {
      max = Math.max(max, counts.get(k));
    }
    return Z.valueOf(max);
  }
}
