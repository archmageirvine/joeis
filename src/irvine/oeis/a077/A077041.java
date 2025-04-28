package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A077041 Primes p such that abs(A077039(A049084(p))) &gt; p.
 * @author Sean A. Irvine
 */
public class A077041 extends A000040 {

  private final Sequence mA = new A077039();

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mA.next().abs().compareTo(p) > 0) {
        return p;
      }
    }
  }
}

