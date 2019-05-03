package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007823 <code>A007824(n)/16</code>.
 * @author Sean A. Irvine
 */
public class A007823 extends A007824 {

  @Override
  public Z next() {
    return super.next().shiftRight(4);
  }
}
