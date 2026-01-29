package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A173206 a(n) = Smallest number which has in its English name the letter "T" in the n-th position beginning the count from the end.
 * @author Sean A. Irvine
 */
public class A173206 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = 1; // 0 and 1 don't have a T
    while (true) {
      final String eng = English.SINGLETON.toRawText(++k);
      if (eng.length() >= mN && eng.charAt(eng.length() - mN) == 't') {
        return Z.valueOf(k);
      }
    }
  }
}
