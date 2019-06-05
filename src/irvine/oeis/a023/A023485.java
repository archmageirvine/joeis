package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000204;
import irvine.oeis.a001.A001690;

/**
 * A023485 <code>a(n) = b(n) + d(n)</code>, where <code>b(n) = (n-th</code> Lucas number <code>A000204 &gt; 1)</code> and <code>d(n) = (n-th</code> nonFibonacci number).
 * @author Sean A. Irvine
 */
public class A023485 extends A000204 {

  final Sequence mA = new A001690();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
