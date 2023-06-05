package irvine.oeis.a273;
// manually m1pow/m1mul at 2023-06-04 18:45

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005043;
import irvine.oeis.a005.A005717;

/**
 * A273020 a(n) = Sum_{k=0..n} C(n,k)*((-1)^n*(C(k,n-k)-C(k,n-k-1))+C(n-k,k+1)).
 * @author Georg Fischer
 */
public class A273020 extends Sequence0 {

  private int mN = -1;
  private final A005043 mSeq1 = new A005043();
  private final A005717 mSeq2 = new A005717();

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().multiply(((mN & 1) == 0) ? 1 : -1).add((mN == 0) ? Z.ZERO : mSeq2.next());
  }
}
