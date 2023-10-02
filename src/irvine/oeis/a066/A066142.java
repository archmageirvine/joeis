package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A066142 a(n) = (n!)^2 + n! + 1.
 * @author Sean A. Irvine
 */
public class A066142 extends A000142 {

  @Override
  public Z next() {
    final Z f = super.next();
    return f.square().add(f).add(1);
  }
}
