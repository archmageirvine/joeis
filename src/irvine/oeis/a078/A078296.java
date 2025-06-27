package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A078296 a(1) = 1, a(n) for n &gt; 1 is the smallest multiple of a(n-1) that begins with the concatenation 123... up to n.
 * @author Sean A. Irvine
 */
public class A078296 extends A007908 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z prefix = super.next();
    Z tens = Z.ONE;
    while (true) {
      final Z w = prefix.multiply(tens);
      if (w.mod(mA).isZero()) {
        mA = w;
        break;
      }
      final Z v = mA.subtract(tens.modMultiply(prefix, mA));
      if (v.compareTo(tens) < 0) {
        mA = w.add(v);
        break;
      }
      tens = tens.multiply(10);
    }
    return mA;
  }
}

