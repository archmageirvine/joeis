package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047071 Array T by antidiagonals: T(h,k)=number of paths consisting of steps from (0,0) to (h,k) such that each step has length 1 directed up or right and no step touches the line y=3x unless x=0 or x=h.
 * @author Sean A. Irvine
 */
public class A047071 extends A047010 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN - mM, mM);
  }
}
