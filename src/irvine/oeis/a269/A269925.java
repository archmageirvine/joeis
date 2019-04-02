package irvine.oeis.a269;

import irvine.math.z.Z;

/**
 * A269925 Triangle read by rows: T(n,f) is the number of rooted maps with n edges and f faces on an orientable surface of genus 5.
 * @author Sean A. Irvine
 */
public class A269925 extends A269920 {

  private int mN = 9;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN - 8) {
      ++mN;
      mM = 1;
    }
    return get(mN, 5, mM);
  }

}
