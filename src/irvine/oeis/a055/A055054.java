package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.UnionSequence;

/**
 * A055054 Numbers of the form 4^i*(8j+7) or 4^i*(3j+1).
 * @author Sean A. Irvine
 */
public class A055054 extends UnionSequence {

  /** Construct the sequence. */
  public A055054() {
    super(new Sequence0() {
      private final TreeSet<Long> mA = new TreeSet<>();
      private long mN = 7;

      @Override
      public Z next() {
        if (mA.isEmpty() || mA.first() >= mN) {
          mA.add(mN);
          mN += 8;
        }
        final long t = mA.pollFirst();
        mA.add(t * 4);
        return Z.valueOf(t);
      }
    }, new Sequence0() {
      private final TreeSet<Long> mA = new TreeSet<>();
      private long mN = 1;

      @Override
      public Z next() {
        if (mA.isEmpty() || mA.first() >= mN) {
          mA.add(mN);
          mN += 3;
        }
        final long t = mA.pollFirst();
        mA.add(t * 4);
        return Z.valueOf(t);
      }
    });
  }
}
