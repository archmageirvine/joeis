package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028668 Pseudo Galois numbers for d=6.
 * @author Sean A. Irvine
 */
public class A028668 extends A028665 {

  @Override
  protected Z power() {
    return Z.SIX;
  }
}
