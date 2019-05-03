package irvine.oeis.a269;

import irvine.math.z.Z;

/**
 * A269922 Triangle read by rows: <code>T(n,f)</code> is the number of rooted maps with n edges and f faces on an orientable surface of genus 2.
 * @author Sean A. Irvine
 */
public class A269922 extends A269920 {

  private int mN = 3;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN - 2) {
      ++mN;
      mM = 1;
    }
    return get(mN, 2, mM);
  }

}
