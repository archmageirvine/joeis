package irvine.oeis.a169;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A169587 The total number of ways of partitioning the multiset {1,1,1,2,3,...,n-2}.
 * <code>a(n)=(Bell(n)+3Bell(n-1)+5Bell(n-2)+2Bell(n-3))/6</code>.
 * @author Georg Fischer
 */
public class A169587 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    return BellNumbers.bell(mN)
      .add(BellNumbers.bell(mN - 1).multiply(3))
      .add(BellNumbers.bell(mN - 2).multiply(5))
      .add(BellNumbers.bell(mN - 3).multiply2()).divide(6);
  }
}
