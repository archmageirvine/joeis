package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a090.A090946;

/**
 * A023494 a(n) = b(n) + d(n), where b(n) = (n-th Fibonacci number &gt; 2) and d(n) = (n-th non-Lucas number).
 * @author Sean A. Irvine
 */
public class A023494 extends A000045 {

  final Sequence mA = new A090946();
  {
    super.next();
    super.next();
    super.next();
    next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
