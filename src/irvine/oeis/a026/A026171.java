package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026171 <code>a(n) = (s(n) - s(n-1))/2</code>, where s <code>= A026169</code>.
 * @author Sean A. Irvine
 */
public class A026171 extends A026169 {

  {
    super.next();
  }

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t).abs().divide2();
  }
}
