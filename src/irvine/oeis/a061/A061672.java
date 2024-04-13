package irvine.oeis.a061;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A061672 Smallest positive number formed by a set of digits whose product = sum of the digits.
 * @author Sean A. Irvine
 */
public class A061672 extends Sequence1 {

  private final TreeMap<Z, Z> mA = new TreeMap<>();
  {
    for (Z k = Z.ONE; !Z.TEN.equals(k); k = k.add(1)) {
      mA.put(k, k);
    }
  }

  private void augment(final Z n) {
    for (long r = n.mod(10); r < 10; ++r) {
      final Z t = n.multiply(10).add(r);
      final Z sum = Functions.DIGIT_SUM.z(t);
      final Z prod = Functions.DIGIT_PRODUCT.z(t);
      final Z diff = prod.subtract(sum);
      if (diff.isZero()) {
        mA.put(t, t);
      } else if (diff.signum() > 0) {
        final String v = StringUtils.rep('1', diff.intValueExact()) + t;
        mA.put(new Z(v), t);
      }
    }
  }

  @Override
  public Z next() {
    final Map.Entry<Z, Z> e = mA.pollFirstEntry();
    augment(e.getValue());
    return e.getKey();
  }
}

