package irvine.oeis.a153;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a048.A048211;
import irvine.util.Pair;

/**
 * A153588 Number of resistance values that can be constructed using up to n equal resistances by arranging them in an arbitrary series-parallel arrangement.
 * @author Sean A. Irvine
 */
public class A153588 extends A048211 {

  private final HashSet<Pair<Long, Long>> mSeen = new HashSet<>();

  @Override
  public Z next() {
    super.next();
    mSeen.addAll(mKnown.get(mKnown.size() - 1));
    return Z.valueOf(mSeen.size());
  }
}

