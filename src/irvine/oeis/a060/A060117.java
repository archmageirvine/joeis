package irvine.oeis.a060;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060117 A list of all finite permutations in "PermUnrank3R" ordering. (Inverses of the permutations of A060118.).
 * @author Sean A. Irvine
 */
public class A060117 extends Sequence0 {

  private IntegerPermutation mA = new IntegerPermutation();
  private int mN = -1;
  private int mM = 0;

  protected IntegerPermutation permUnrank3R(final int r) {
    return IntegerPermutation.permUnrank3R(r);
  }

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mM = 0;
      final int r = ++mN;
      mA = permUnrank3R(r);
    }
    return Z.valueOf(mA.image(mM) + 1);
  }
}
