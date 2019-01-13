package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Roman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A003588.
 * @author Sean A. Irvine
 */
public class A003588 implements Sequence {

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
