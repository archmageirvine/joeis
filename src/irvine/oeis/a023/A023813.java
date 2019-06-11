package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023813 <code>a(n) = n^(n*(n+1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A023813 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN * (mN + 1) / 2);
  }
}

