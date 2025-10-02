package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a072.A072522;

/**
 * A080824 Numbers n such that T(n)=T(A072522(n))+T(A072522(n+1)), T(i) being the triangular numbers.
 * @author Sean A. Irvine
 */
public class A080824 extends A072522 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return Functions.TRINV.z(Functions.TRIANGULAR.z(mA).add(Functions.TRIANGULAR.z(t)));
  }
}
