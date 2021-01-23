package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007504;
import irvine.oeis.a072.A072475;

/**
 * A024850 Let c(k) denote the k-th composite number and p(k) the k-th prime number; then a(n) = Sum_{i=n*(n-1)/2+1 .. n*(n+1)/2} c(i) - Sum_{i=1..n} p(i).
 * @author Sean A. Irvine
 */
public class A024850 extends A072475 {

  private final Sequence mA = new A007504();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
