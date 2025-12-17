package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002385;

/**
 * A082625 Smallest palindromic prime that ends (on the least significant side) in prime(n).
 * @author Sean A. Irvine
 */
public class A082625 extends A000040 {

  private Z mMod = Z.TEN;

  @Override
  public Z next() {
    final Z prime = super.next();
    if (prime.compareTo(mMod) >= 0) {
      mMod = mMod.multiply(10);
    }
    final Sequence palin = new A002385();
    while (true) {
      final Z p = palin.next();
      if (p.mod(mMod).equals(prime)) {
        return p;
      }
    }
  }
}
