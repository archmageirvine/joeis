package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031155 <code>2^A021140(n)</code>.
 * @author Sean A. Irvine
 */
public class A031155 extends A031140 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValueExact());
  }
}
