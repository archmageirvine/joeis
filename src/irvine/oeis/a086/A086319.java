package irvine.oeis.a086;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086319 Primes produced by repeated application of the formula p -&gt; (4p +- 3) starting at the prime 2.
 * @author Sean A. Irvine
 */
public class A086319 extends Sequence0 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.TWO);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      return null;
    }
    final Z p = mA.pollFirst();
    final Z p4 = p.multiply(4);
    final Z t0 = p4.subtract(3);
    if (t0.isProbablePrime()) {
      mA.add(t0);
    }
    final Z t1 = p4.add(3);
    if (t1.isProbablePrime()) {
      mA.add(t1);
    }
    return p;
  }
}
