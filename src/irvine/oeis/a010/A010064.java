package irvine.oeis.a010;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence0;

/**
 * A010064 Base 4 self or Colombian numbers (not of form k + sum of base 4 digits of k).
 * @author Sean A. Irvine
 */
public class A010064 extends ComplementSequence {

  /** Construct the sequence. */
  public A010064() {
    super(new Sequence0() {
      private final TreeSet<Z> mSet = new TreeSet<>();
      private Z mN = Z.ZERO;

      @Override
      public Z next() {
        while (mSet.isEmpty() || mSet.first().compareTo(mN) >= 0) {
          mSet.add(mN.add(ZUtils.digitSum(mN, 4)));
          mN = mN.add(1);
        }
        return mSet.pollFirst();
      }
    });
  }
}

