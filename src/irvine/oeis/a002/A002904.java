package irvine.oeis.a002;

import java.util.HashMap;
import java.util.Locale;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;
import irvine.util.string.Roman;

/**
 * A002904 Delete all letters except c, d, i, l, m, v, x from the English name of n, then read as Roman numeral if possible, otherwise 0.
 * @author Sean A. Irvine
 */
public class A002904 extends Sequence1 {

  private int mN = 0;

  // We require a strict interpretation here
  private final HashMap<String, Integer> mToArabic = new HashMap<>();
  {
    for (int k = 1; k < 5000; ++k) {
      mToArabic.put(Roman.roman(k), k);
    }
  }

  @Override
  public Z next() {
    final String english = English.SINGLETON.toText(++mN);
    final StringBuilder roman = new StringBuilder();
    for (int k = 0; k < english.length(); ++k) {
      final char c = english.charAt(k);
      if ("cdilmvx".indexOf(c) != -1) {
        roman.append(c);
      }
    }
    if (roman.length() == 0) {
      return Z.ZERO;
    }
    final Integer arabic = mToArabic.get(roman.toString().toUpperCase(Locale.getDefault()));
    return arabic == null ? Z.ZERO : Z.valueOf(arabic);
  }
}
