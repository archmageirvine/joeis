package irvine.oeis.a072;

import irvine.math.z.Z;

/**
 * A072454 Number of nontotients in the reduced residue system of 2n-1.
 * @author Sean A. Irvine
 */
public class A072454 extends A072106 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(compute(mN));
  }
}
