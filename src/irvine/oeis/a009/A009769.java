package irvine.oeis.a009;

import irvine.math.z.Z;

/**
 * A009769 Expansion of <code>tanh(log(1+1/x))</code>.
 * @author Sean A. Irvine
 */
public class A009769 extends A009014 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}
