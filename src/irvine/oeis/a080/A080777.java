package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.util.array.DynamicIntArray;
import irvine.util.string.English;

/**
 * A080758.
 * @author Sean A. Irvine
 */
public class A080777 extends Sequence3 {

  private final DynamicIntArray mFirsts = new DynamicIntArray();
  private int mM = 0;
  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final int len = English.SINGLETON.toRawText(++mM).length();
      if (mFirsts.get(len) == 0) {
        mFirsts.set(len, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
