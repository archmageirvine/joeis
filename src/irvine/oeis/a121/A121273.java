package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A121273 Number of different n-dimensional convex regular polytopes that can tile n-dimensional space.
 * <code>a(n)=3 for n = 2 & 4. a(n)=1 for all other n</code>
 * @author Georg Fischer
 */
public class A121273 extends Sequence1 {

  private long mN = 0;

  /** Construct the sequence. */
  public Z next() {
    ++mN;
    return (mN == 2 || mN == 4) ? Z.THREE : Z.ONE;
  }
}
