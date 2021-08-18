package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004737 Concatenation of sequences (1,2,...,n-1,n,n-1,...,1) for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A004737 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 1) {
      ++mN;
      mM = 2 * mN - 1;
    }
    return Z.valueOf(mM > mN ? 2 * mN - mM : mM);
  }
}

