package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A030657 Parity of digits of Pi.
 * @author Sean A. Irvine
 */
public class A030657 extends A000796 {

  @Override
  public Z next() {
    return super.next().and(Z.ONE);
  }
}

