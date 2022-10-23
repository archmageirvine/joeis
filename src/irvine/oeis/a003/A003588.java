package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Roman;

/**
 * A003588 Roman numerals with 1 letter, in alphabetical order; then those with 2 letters, etc.
 * @author Sean A. Irvine
 */
public class A003588 extends Sequence1 {

  private final List<String> mRoman = new ArrayList<>();
  private int mDigits = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (mM >= mRoman.size()) {
      ++mDigits;
      mRoman.clear();
      mM = 0;
      for (int k = 1; k <= mDigits * 1000; ++k) {
        final String roman = Roman.roman(k);
        if (roman.length() == mDigits) {
          mRoman.add(roman);
        }
      }
      Collections.sort(mRoman);
    }
    return Z.valueOf(Roman.parse(mRoman.get(mM++)));
  }
}
