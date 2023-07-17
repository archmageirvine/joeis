package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a079.A079126;

/**
 * A026840 Triangular array T read by rows: T(n,k) = number of partitions of n into distinct parts &lt;= k, for k=1,2,...n.
 * @author Sean A. Irvine
 */
public class A026840 extends A079126 {

  /** Construct the sequence. */
  public A026840() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
