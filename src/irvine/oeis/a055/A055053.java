package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.UnionSequence;

/**
 * A055053 Numbers of the form 4^i*(8j+7) or 4^i*(5j+-2).
 * @author Sean A. Irvine
 */
public class A055053 extends UnionSequence {

  /** Construct the sequence. */
  public A055053() {
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
      private long mN = 2;
      private long mAdd = 1;

      @Override
      public Z next() {
        if (mA.isEmpty() || mA.first() >= mN) {
          mA.add(mN);
          mN += mAdd;
          mAdd = 5 - mAdd;
        }
        final long t = mA.pollFirst();
        mA.add(t * 4);
        return Z.valueOf(t);
      }
    });
  }
}
