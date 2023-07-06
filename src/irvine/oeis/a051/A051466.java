package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.MultiplicativeClosureSequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a025.A025487;

/**
 * A051466 Largest product of primorials less than A025487(n) that divides A025487(n).
 * @author Sean A. Irvine
 */
public class A051466 extends A025487 {

  {
    super.next();
  }
  private final MemorySequence mA = MemorySequence.cachedSequence(new MultiplicativeClosureSequence(new A002110().skip(1)));

  @Override
  public Z next() {
    final Z t = super.next();
    int k = -1;
    Z res = Z.ONE;
    while (true) {
      final Z a = mA.a(++k);
      if (a.compareTo(t) >= 0) {
        break;
      }
      if (t.mod(a).isZero()) {
        res = a;
      }
    }
    return res;
  }
}
