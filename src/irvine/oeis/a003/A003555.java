package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003555 <code>Sum{1,2,...,(10^n - 1)/9}</code>, or <code>(10^n -1)/9)((10^n -1)/9 +1)/2 (n-th</code> term is the middle <code>2(n-1)</code> digits of the <code>(n+9)-th</code> term for <code>n &gt; 1)</code>.
 * @author Sean A. Irvine
 */
public class A003555 implements Sequence {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    final Z t = mA.subtract(1).divide(9);
    return t.multiply(t.add(1)).divide2();
  }
}
