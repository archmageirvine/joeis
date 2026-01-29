package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A173203 a(n) is the smallest number which has in its English name the letter "e" in the n-th position beginning the count from the end, or -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A173203 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      final String eng = English.SINGLETON.toRawText(++k);
      if (eng.length() >= mN && eng.charAt(eng.length() - mN) == 'e') {
        return Z.valueOf(k);
      }
    }
  }
}
