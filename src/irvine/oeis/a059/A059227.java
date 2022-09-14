package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059227 Last entry in n-th row of triangle defined in A059226.
 * @author Sean A. Irvine
 */
public class A059227 extends A059226 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
