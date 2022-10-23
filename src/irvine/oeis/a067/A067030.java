package irvine.oeis.a067;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067030 Numbers of the form k + reverse(k) for at least one k.
 * @author Sean A. Irvine
 */
public class A067030 extends Sequence0 {

  private final TreeSet<Long> mValues = new TreeSet<>();
  private long mN = -1;

  @Override
  public Z next() {
    while (mValues.isEmpty() || mN < mValues.first()) {
      ++mN;
      mValues.add(mN + LongUtils.reverse(mN));
    }
    return Z.valueOf(mValues.pollFirst());
  }
}

