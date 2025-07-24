package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a052.A052307;

/**
 * A078925 Triangle of T1(n,m) = number of bracelets (necklaces that can be turned over) with m white beads and (2n+1-m) black ones, for 1&lt;=m&lt;=n.
 * @author Sean A. Irvine
 */
public class A078925 extends A052307 {

  private long mN = 0;
  private long mM = 0;

  /** Construct the sequence. */
  public A078925() {
    super(1);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(2 * mN + 1, mM + 1);
  }
}
