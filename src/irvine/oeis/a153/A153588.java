package irvine.oeis.a153;

import irvine.math.z.Z;
import irvine.oeis.a048.A048211;
import irvine.util.Pair;

import java.util.HashSet;

/**
 * A153588.
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

