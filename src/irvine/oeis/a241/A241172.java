package irvine.oeis.a241;

import irvine.math.z.Z;

/**
 * A241172 Joffe's central differences of 0: A241171(n,n-2).
 * @author Georg Fischer
 */
public class A241172 extends A241171 {

  private int mN = 0;

  {
    next();
  }

  @Override
  public int getOffset() {
    return 2;
  }

  @Override
  public Z next() {
    ++mN;
    return joffeDifference(mN, mN - 2);
  }
}
