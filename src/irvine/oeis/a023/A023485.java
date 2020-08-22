package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000204;
import irvine.oeis.a001.A001690;

/**
 * A023485 a(n) = b(n) + d(n), where b(n) = (n-th Lucas number A000204 &gt; 1) and d(n) = (n-th non-Fibonacci number).
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
