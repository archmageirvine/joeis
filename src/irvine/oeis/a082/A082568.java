package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a033.A033949;

/**
 * A082568 First nontrivial square root of unity mod A033949(n), i.e., smallest x &gt; 1 such that x^2 == 1 mod A033949(n).
 * @author Sean A. Irvine
 */
public class A082568 extends A033949 {

  @Override
  public Z next() {
    final Z m = super.next();
    long k = 1;
    while (true) {
      if (Z.valueOf(++k).modSquare(m).isOne()) {
        return Z.valueOf(k);
      }
    }
  }
}
