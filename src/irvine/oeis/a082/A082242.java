package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;

/**
 * A082242 Multiples of 4 that are the concatenation of 4 consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A082242 extends PrependSequence {

  /** Construct the sequence. */
  public A082242() {
    super(1, new Sequence1() {
      private long mN = 4;
      @Override
      public Z next() {
        mN += 4;
        return new Z(new StringBuilder().append(mN + 1).append(mN + 2).append(mN + 3).append(mN + 4));
      }
    }, 3456);
  }
}
