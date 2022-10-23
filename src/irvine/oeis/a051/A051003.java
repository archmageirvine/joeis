package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051003 Beastly (or hateful) numbers: numbers containing the string 666 in their decimal expansion.
 * @author Sean A. Irvine
 */
public class A051003 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.valueOf(666));
  }
  private int mN = 10;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final long lim = 2 * mN;
      for (long k = mN; k < lim; ++k) {
        final String t = String.valueOf(k).substring(1); // can have leading 0s
        for (int ins = 0; ins <= t.length(); ++ins) {
          if (ins == 0 || t.charAt(0) != '0') {
            mA.add(new Z(t.substring(0, ins) + "666" + t.substring(ins)));
          }
        }
      }
      mN *= 10;
    }
    return mA.pollFirst();
  }
}
