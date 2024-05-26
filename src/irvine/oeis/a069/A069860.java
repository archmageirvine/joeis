package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.UnionSequence;

/**
 * A069860 Numbers n that divide the concatenation of n+1 and n+2.
 * @author Sean A. Irvine
 */
public class A069860 extends UnionSequence {

  /** Construct the sequence. */
  public A069860() {
    super(1, new FiniteSequence(1, 3),
      new Sequence1() {
        Z mT = Z.ONE;
        @Override
        public Z next() {
          mT = mT.multiply(10);
          return mT.add(2).divide2();
        }
      },
      new Sequence1() {
        Z mT = Z.ONE;
        @Override
        public Z next() {
          mT = mT.multiply(10);
          return mT.add(2).divide(3);
        }
      },
      new Sequence1() {
        Z mT = Z.ONE;
        @Override
        public Z next() {
          mT = mT.multiply(10);
          return mT.add(2).divide(6);
        }
      },
      new Sequence1() {
        Z mT = Z.valueOf(100000);
        @Override
        public Z next() {
          final Z a = mT.add(2).divide(7);
          mT = mT.multiply(1000000);
          return a;
        }
      });
  }
}

