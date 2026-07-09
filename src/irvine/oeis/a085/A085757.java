package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.UnionSequence;

/**
 * A085757 Differences between successive multiples of either 11 or 19.
 * @author Sean A. Irvine
 */
public class A085757 extends DifferenceSequence {

  /** Construct the sequence. */
  public A085757() {
    super(0, new UnionSequence(
      new Sequence0() {
        private Z mA = Z.valueOf(-11);

        @Override
        public Z next() {
          mA = mA.add(11);
          return mA;
        }
      },
      new Sequence0() {
        private Z mA = Z.ZERO;

        @Override
        public Z next() {
          mA = mA.add(19);
          return mA;
        }
      }));
  }
}
