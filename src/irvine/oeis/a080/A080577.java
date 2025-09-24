package irvine.oeis.a080;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080573.
 * @author Sean A. Irvine
 */
public class A080577 extends Sequence1 {

  private IntegerPartition mPart = new IntegerPartition(1);
  private int[] mP = new int[0];
  private int mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mP.length) {
      mM = 0;
      mP = mPart.next();
      if (mP == null) {
        mPart = new IntegerPartition(++mN);
        mP = mPart.next();
      }
    }
    return Z.valueOf(mP[mM]);
  }
}

