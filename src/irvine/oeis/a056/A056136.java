package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a029.A029578;

/**
 * A056136 Largest positive integer whose harmonic mean with another positive integer is n.
 * @author Sean A. Irvine
 */
public class A056136 extends A029578 {

  private long mN = 0;
  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(++mN).divide2();
  }
}
