package irvine.oeis.a269;

import irvine.math.z.Z;

/**
 * A269921 Triangle read by rows: T(n,f) is the number of rooted maps with n edges and f faces on an orientable surface of genus 1.
 * @author Sean A. Irvine
 */
public class A269921 extends A269920 {

  /** Construct the sequence. */
  public A269921() {
    super(2);
  }

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, 1, mM);
  }

}
