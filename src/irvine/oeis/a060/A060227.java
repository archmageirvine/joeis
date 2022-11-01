package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;
import irvine.util.string.English;

/**
 * A060227 a(n) is the smallest number k such that the letter "N" appears n times when k is written in English.
 * @author Sean A. Irvine
 */
public class A060227 extends Sequence1 {

  private final DynamicIntArray mA = new DynamicIntArray();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      final String e = English.SINGLETON.toRawText(++mM);
      int cnt = 0;
      for (int k = 0; k < e.length(); ++k) {
        if (e.charAt(k) == 'n') {
          ++cnt;
        }
      }
      if (mA.get(cnt) == 0) {
        mA.set(cnt, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

