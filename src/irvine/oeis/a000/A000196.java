package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000196 Integer part of square root of n. Or, number of positive squares <code>&lt;=</code> n. Or, n appears <code>2n+1</code> times.
 * @author Sean A. Irvine
 */
public class A000196 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.sqrt();
  }
}

