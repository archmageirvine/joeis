package irvine.oeis.a005;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005242 A self-generating sequence.
 * @author Sean A. Irvine
 */
public class A005242 extends Sequence1 {

  private final HashSet<Long> mExcluded = new HashSet<>();
  private long mA = 0;
  private long mB = 0;

  @Override
  public Z next() {
    long v = mB;
    while (mExcluded.remove(++v)) {
      // do nothing
    }
    mExcluded.add(v + mB);
    mExcluded.add(v + mB + mA);
    mA = mB;
    mB = v;
    return Z.valueOf(v);
  }
}
