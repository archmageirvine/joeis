package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a090.A090946;

/**
 * A023496 a(n) = b(n) + d(n), where b(n) = (n-th Fibonacci number &gt; 2) and d(n) = (n-th number that is 1 or is not a Lucas number).
 * @author Sean A. Irvine
 */
public class A023496 extends A000045 {

  final Sequence mA = new PrependSequence(new SkipSequence(new A090946(), 1), 0, 1);
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
