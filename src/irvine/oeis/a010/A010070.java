package irvine.oeis.a010;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence0;

/**
 * A010070 Base 8 self or Colombian numbers (not of form k + sum of base 8 digits of k).
 * @author Sean A. Irvine
 */
public class A010070 extends ComplementSequence {

  /** Construct the sequence. */
  public A010070() {
    super(new Sequence0() {
      private final TreeSet<Z> mSet = new TreeSet<>();
      private Z mN = Z.ZERO;

      @Override
      public Z next() {
        while (mSet.isEmpty() || mSet.first().compareTo(mN) >= 0) {
          mSet.add(mN.add(Functions.DIGIT_SUM.l(8, mN)));
          mN = mN.add(1);
        }
        return mSet.pollFirst();
      }
    });
  }
}

