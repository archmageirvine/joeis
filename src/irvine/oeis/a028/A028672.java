package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028672 Pseudo Galois numbers for d=10.
 * @author Sean A. Irvine
 */
public class A028672 extends A028665 {

  @Override
  protected Z power() {
    return Z.TEN;
  }
}
