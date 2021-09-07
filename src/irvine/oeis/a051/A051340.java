package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051340 A simple 2-dimensional array, read by antidiagonals: T[i,j] = 1 for j&gt;0, T[i,0] = i+1; i,j = 0,1,2,3,...
 * @author Sean A. Irvine
 */
public class A051340 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
      return Z.valueOf(mN);
    }
    return Z.ONE;
  }
}
