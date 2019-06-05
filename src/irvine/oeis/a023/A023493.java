package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a090.A090946;

/**
 * A023493.
 * @author Sean A. Irvine
 */
public class A023493 extends A000032 {

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
