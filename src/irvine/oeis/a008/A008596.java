package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008596.
 * @author Sean A. Irvine
 */
public class A008596 implements Sequence {

  private Z mN = Z.valueOf(-14);

  @Override
  public Z next() {
    mN = mN.add(14);
    return mN;
  }
}

