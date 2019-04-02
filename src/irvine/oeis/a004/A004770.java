package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004770 Numbers of form 8n+5; or, numbers whose binary expansion ends in 101.
 * @author Sean A. Irvine
 */
public class A004770 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN;
  }
}

