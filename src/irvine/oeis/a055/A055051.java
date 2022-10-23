package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A055051 Numbers of the form 2^(2i+1)*(8j+7), 2^(2i+1)*(16j+6) or 2^(2i+1)*(4j+3).
 * @author Sean A. Irvine
 */
public class A055051 extends Sequence1 {

  private final Sequence mASeq = new A055039();
  private final Sequence mBSeq = new Sequence() {
    private final TreeSet<Long> mA = new TreeSet<>();
    private long mN = 12;

    @Override
    public Z next() {
      if (mA.isEmpty() || mA.first() >= mN) {
        mA.add(mN);
        mN += 32;
      }
      final long t = mA.pollFirst();
      mA.add(t * 4);
      return Z.valueOf(t);
    }
  };
  private final Sequence mCSeq = new Sequence() {
    private final TreeSet<Long> mA = new TreeSet<>();
    private long mN = 6;

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
  };
  private Z mA = mASeq.next();
  private Z mB = mBSeq.next();
  private Z mC = mCSeq.next();

  @Override
  public Z next() {
    final Z t;
    if (mA.compareTo(mB) <= 0) {
      if (mA.compareTo(mC) <= 0) {
        t = mA;
        mA = mASeq.next();
      } else if (mB.compareTo(mC) <= 0) {
        t = mB;
        mB = mBSeq.next();
      } else {
        t = mC;
        mC = mCSeq.next();
      }
    } else if (mB.compareTo(mC) <= 0) {
      t = mB;
      mB = mBSeq.next();
    } else {
      t = mC;
      mC = mCSeq.next();
    }
    return t;
  }
}
