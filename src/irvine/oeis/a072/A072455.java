package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072455 Number of totients in the reduced residue system of 2n-1.
 * @author Sean A. Irvine
 */
public class A072455 extends A072454 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Functions.PHI.z(mN).subtract(super.next());
  }
}
