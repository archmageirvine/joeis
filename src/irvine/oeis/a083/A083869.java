package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a166.A166994;

/**
 * A083869 a(1)=1 then a(n) is the least k&gt;=1 such that the nested radical sqrt(a(1)^2+sqrt(a(2)^2+sqrt(a(3)^2+(....+sqrt(a(n)^2)))...) is an integer.
 * @author Sean A. Irvine
 */
public class A083869 extends A166994 {

  private int mN = 0;

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}
