package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a054.A054988;
import irvine.oeis.a054.A054989;

/**
 * A056160 Sum of A054988 and A054989.
 * @author Sean A. Irvine
 */
public class A056160 extends A054988 {

  private final Sequence mA = new A054989();

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}

