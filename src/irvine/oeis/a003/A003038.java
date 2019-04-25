package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.TreeSet;

/**
 * A003038 Dimensions of split simple Lie algebras over <code>any</code> field of characteristic zero.
 * @author Sean A. Irvine
 */
public class A003038 implements Sequence {

  private final TreeSet<Z> mSeq = new TreeSet<>();
  {
    mSeq.add(Z.valueOf(14));
    mSeq.add(Z.valueOf(52));
    mSeq.add(Z.valueOf(78));
    mSeq.add(Z.valueOf(133));
    mSeq.add(Z.valueOf(248));
  }
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;
  private Z mD = Z.FOUR;

  private boolean checkAdd(final Z v) {
    if (mSeq.isEmpty() || mSeq.first().compareTo(v) >= 0) {
      mSeq.add(v);
      return true;
    }
    return false;
  }

  @Override
  public Z next() {
    if (checkAdd(mA.multiply(mA.add(2)))) {
      mA = mA.add(1);
    }
    if (checkAdd(mB.multiply(mB.multiply2().add(1)))) {
      mB = mB.add(1);
    }
    if (checkAdd(mD.multiply(mD.multiply2().subtract(1)))) {
      mD = mD.add(1);
    }
    return mSeq.pollFirst();
  }
}
