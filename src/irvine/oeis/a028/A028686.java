package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028686 Pseudo Galois numbers for <code>d=24</code>.
 * @author Sean A. Irvine
 */
public class A028686 extends A028665 {
  
  private static final Z Z24 = Z.valueOf(24);

  @Override
  protected Z power() {
    return Z24;
  }
}
