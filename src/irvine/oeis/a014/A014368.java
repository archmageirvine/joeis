package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014368 <code>a(n) =</code> bc, where <code>n = C(b</code>,2)+C(c,1), b&gt;c&gt;=0.
 * @author Sean A. Irvine
 */
public class A014368 implements Sequence {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM == mN) {
      ++mN;
      mM = 0;
    }
    return new Z(mN + String.valueOf(mM));
  }
}

