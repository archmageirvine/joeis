package irvine.factor.project.factorial;

import irvine.math.z.Z;

/**
 * Used by <code>Factorial</code> class.
 *
 * @author Sean A. Irvine
 */
class Small {

  private final Z[] mSmall;
  private final int[] mValue;

  Small(final int length) {
    mSmall = new Z[length];
    mValue = new int[length];
  }

  void check(Z s, int v) {
    int i = mSmall.length - 1;
    while ((mSmall[i] == null || s.compareTo(mSmall[i]) < 0) && --i >= 0) {
      // DO NOTHING
    }
    if (i != mSmall.length - 1) {
      // belongs at i + 1
      ++i;
      while (i < mSmall.length) {
        final Z o = mSmall[i];
        final int ov = mValue[i];
        mSmall[i] = s;
        mValue[i++] = v;
        s = o;
        v = ov;
      }
    }
  }

  String dump(final char sign) {
    final StringBuilder sb = new StringBuilder();
    for (int i = 0; i < mSmall.length; ++i) {
      if (i != 0) {
        sb.append(", ");
      }
      sb.append(mValue[i])
        .append('!')
        .append(sign)
        .append("1 C")
        .append(mSmall[i].toString().length());
    }
    return sb.toString();
  }
}
