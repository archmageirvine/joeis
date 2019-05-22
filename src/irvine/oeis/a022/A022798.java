package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a008.A008578;

/**
 * A022798 <code>a(n) = P(n) + c(n)</code>, where <code>P(1) = 1, P(n) = (n-1)st</code> prime for <code>n &gt;= 2, c(n) = n-th</code> number not in sequence P.
 * @author Sean A. Irvine
 */
public class A022798 implements Sequence {

  private final Sequence mA = new A002808();
  private final Sequence mB = new A008578();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
