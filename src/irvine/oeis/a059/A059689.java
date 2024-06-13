package irvine.oeis.a059;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A059689 List consisting of all functions from [1,2,3,...,n] into [1,2,3,...,n] for n=1,2,3,... (written out in full) in lexicographic order.
 * @author Sean A. Irvine
 */
public class A059689 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private int[] mV = new int[0];
  private Bumper mBumper = BumperFactory.range(1, 0);

  @Override
  public Z next() {
    if (++mM >= mV.length) {
      mM = 0;
      if (!mBumper.bump(mV)) {
        mV = new int[++mN];
        Arrays.fill(mV, 1);
        mBumper = BumperFactory.range(1, mN);
      }
    }
    return Z.valueOf(mV[mM]);
  }
}
