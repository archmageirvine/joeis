package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/**
 * A001058.
 * @author Sean A. Irvine
 */
public class A001058 implements Sequence {

  private static class MyComparator implements Comparator<Z>, Serializable {
    @Override
    public int compare(final Z z1, final Z z2) {
      final String a = English.toRawEnglish(z1.intValue());
      final String b = English.toRawEnglish(z2.intValue());
      return b.compareTo(a);
    }
  }

  private int mLimit = 1;
  private int mN = 0;
  private Z[] mSortedValues = new Z[0];
  private int mPos = 0;
  private final MyComparator mComparator = new MyComparator();

  protected Comparator<Z> comparator() {
    return mComparator;
  }

  @Override
  public Z next() {
    if (mPos >= mSortedValues.length) {
      mPos = 0;
      mLimit *= 10;
      mSortedValues = new Z[mLimit - mN];
      for (int k = 0; mN < mLimit; ++k, ++mN) {
        mSortedValues[k] = Z.valueOf(mN);
      }
      Arrays.sort(mSortedValues, comparator());
    }
    //System.out.println("# " + mSortedValues[mPos] + " " + irvine.util.string.French.toFrench(mSortedValues[mPos].intValue()));
    return mSortedValues[mPos++];
  }
}
