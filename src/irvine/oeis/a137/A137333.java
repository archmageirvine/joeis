package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.UnionSequence;

/**
 * A137333 Spiral tiling numbers: union of {3*4^k, k&gt;=0}, {4*9^k, k&gt;=0}, and {6*7^k, k&gt;=0}.
 * @author Sean A. Irvine
 */
public class A137333 extends UnionSequence {

  /** Construct the sequence. */
  public A137333() {
    super(1,
      new Sequence1() {
        private Z mA = null;
        @Override
        public Z next() {
          mA = mA == null ? Z.THREE : mA.multiply(4);
          return mA;
        }
      },
      new Sequence1() {
        private Z mA = null;
        @Override
        public Z next() {
          mA = mA == null ? Z.FOUR : mA.multiply(9);
          return mA;
        }
      },
      new Sequence1() {
        private Z mA = null;
        @Override
        public Z next() {
          mA = mA == null ? Z.SIX : mA.multiply(7);
          return mA;
        }
      });
  }
}
