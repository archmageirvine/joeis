package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a090.A090946;

/**
 * A023490 n-th non-Lucas number plus Fibonacci(n + 1).
 * @author Sean A. Irvine
 */
public class A023490 extends A000045 {

  final Sequence mA = new A090946();
  {
    super.next();
    next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
