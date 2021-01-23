package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a090.A090946;

/**
 * A023497 a(n) = b(n) + d(n), where b(n) = (n-th Lucas number &gt; 3) and d(n) = (n-th number that is 1 or is not a Lucas number).
 * @author Sean A. Irvine
 */
public class A023497 extends A000032 {

  final Sequence mA = new PrependSequence(new SkipSequence(new A090946(), 1), 0, 1);
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
