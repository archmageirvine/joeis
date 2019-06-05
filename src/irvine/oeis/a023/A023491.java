package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a090.A090946;

/**
 * A023491 <code>a(n) = b(n) + d(n)</code>, where <code>b(n) = (n-th</code> Fibonacci number <code>&gt; 1)</code> and <code>d(n) = (n-th non-Lucas</code> number).
 * @author Sean A. Irvine
 */
public class A023491 extends A000045 {

  final Sequence mA = new A090946();
  {
    super.next();
    super.next();
    next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
