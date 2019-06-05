package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000204;
import irvine.oeis.a001.A001690;

/**
 * A023487.
 * @author Sean A. Irvine
 */
public class A023487 extends A000204 {

  final Sequence mA = new A001690();
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
