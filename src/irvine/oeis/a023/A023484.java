package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a001.A001690;

/**
 * A023484 a(n) = b(n) + d(n), where b(n) = (n-th Lucas number) and d(n) = (n-th non-Fibonacci number).
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
