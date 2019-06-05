package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a001.A001690;

/**
 * A023484 <code>a(n) = b(n) + d(n)</code>, where <code>b(n) = (n-th</code> Lucas number) and <code>d(n) = (n-th</code> nonFibonacci number).
 * @author Sean A. Irvine
 */
public class A023484 extends A000032 {

  final Sequence mA = new A001690();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
