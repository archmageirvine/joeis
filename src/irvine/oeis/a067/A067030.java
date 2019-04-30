package irvine.oeis.a067;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A067030 Numbers n of the form <code>k + reverse(k)</code> for at least one k.
 * @author Sean A. Irvine
 */
public class A067030 implements Sequence {

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

