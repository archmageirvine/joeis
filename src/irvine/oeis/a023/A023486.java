package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001690;

/**
 * A023486 a(n) = b(n) + d(n), where b(n) = (n-th Fibonacci number &gt; 2) and d(n) = (n-th non-Fibonacci number).
 * @author Sean A. Irvine
 */
public class A023486 extends A000045 {

  final Sequence mA = new A001690();
  {
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
