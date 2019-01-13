package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011799.
 * @author Sean A. Irvine
 */
public class A011799 implements Sequence {

  // Conjectural -- note there appears to be terms missing from this sequence, but
  // I don't understand enough to tell.

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Z.valueOf(mN).multiply(7).add(1).multiply(mN).divide2().add(3);
  }
}
