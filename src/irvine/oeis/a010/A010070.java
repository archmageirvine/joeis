package irvine.oeis.a010;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;

/**
 * A010070.
 * @author Sean A. Irvine
 */
public class A010070 extends ComplementSequence {

  /** Construct the sequence. */
  public A010070() {
    super(new Sequence() {
      private final TreeSet<Z> mSet = new TreeSet<>();
      private Z mN = Z.ZERO;

      @Override
      public Z next() {
        while (mSet.isEmpty() || mSet.first().compareTo(mN) >= 0) {
          mSet.add(mN.add(ZUtils.digitSum(mN, Z.EIGHT)));
          mN = mN.add(1);
        }
        return mSet.pollFirst();
      }
    });
  }
}

