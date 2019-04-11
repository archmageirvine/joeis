package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001296 4-dimensional pyramidal numbers: <code>a(n) =</code> (3*n+1)*binomial(n+2, <code>3)/4</code>. Also Stirling2(n+2, <code>n)</code>.
 * @author Sean A. Irvine
 */
public class A001296 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Stirling.secondKind(mN + 2, mN);
  }
}
