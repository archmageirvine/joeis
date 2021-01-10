package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038185 One-dimensional cellular automaton 'sigma' (Rule 150).
 * @author Sean A. Irvine
 */
public class A038185 extends A038184 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().shiftRight(++mN);
  }
}
