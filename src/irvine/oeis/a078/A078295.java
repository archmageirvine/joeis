package irvine.oeis.a078;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A078295 Smallest multiple of n whose digits can be re-arranged to be a substring of the cyclic concatenation 1234567890123435678901234...
 * @author Sean A. Irvine
 */
public class A078295 extends Sequence1 {

  private long mN = 0;

  private boolean is(final Z t) {
    final int[] cnts = ZUtils.digitCounts(t);
    if (IntegerUtils.isConstant(cnts)) {
      return true;
    }
    int min = cnts[0];
    int max = cnts[0];
    for (final int c : cnts) {
      if (c > max) {
        max = c;
      }
      if (c < min) {
        min = c;
      }
      if (max - min > 1) {
        return false;
      }
    }
    // We need something like min - max - min, or max - min - max
    if (cnts[0] == min) {
      int k = 1;
      while (cnts[k] != max) {
        ++k;
      }
      while (k < cnts.length && cnts[k] != min) {
        ++k;
      }
      // Now any return to max will be fail
      while (++k < cnts.length) {
        if (cnts[k] == max) {
          return false;
        }
      }
      return true;
    } else {
      assert cnts[0] == max;
      int k = 1;
      while (cnts[k] != min) {
        ++k;
      }
      while (k < cnts.length && cnts[k] != max) {
        ++k;
      }
      // Now any return to min will be fail
      while (++k < cnts.length) {
        if (cnts[k] == min) {
          return false;
        }
      }
      return true;
    }
  }

  @Override
  public Z next() {
    ++mN;
    Z t = Z.valueOf(mN);
    while (true) {
      if (is(t)) {
        return t;
      }
      t = t.add(mN);
    }
  }
}

