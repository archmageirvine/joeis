package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a090.A090946;

/**
 * A023499 a(n) = b(n) + d(n), where b(n) = ( (n+1)st Fibonacci number) and d(n) = (n-th number that is 1, 2, or 3, or is not a Lucas number).
 * @author Sean A. Irvine
 */
public class A023499 extends A000045 {

  final Sequence mA = new PrependSequence(new SkipSequence(new A090946(), 2), 0, 1, 2, 3);
  {
    super.next();
    next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
