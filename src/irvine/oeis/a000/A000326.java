package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000326 Pentagonal numbers: a(n) = n*(3*n-1)/2.
 * @author Sean A. Irvine
 */
public class A000326 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(3 * mN - 1).divide2();
  }
}

