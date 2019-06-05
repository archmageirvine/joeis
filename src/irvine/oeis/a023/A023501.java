package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a090.A090946;

/**
 * A023501.
 * @author Sean A. Irvine
 */
public class A023501 extends A000032 {

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
