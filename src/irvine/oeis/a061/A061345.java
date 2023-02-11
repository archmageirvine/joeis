package irvine.oeis.a061;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061345 Odd prime powers.
 * @author Sean A. Irvine
 */
public class A061345 extends A000040 {

  private final TreeMap<Z, Z> mA = new TreeMap<>();
  {
    setOffset(0);
    mA.put(Z.ONE, null);
    super.next(); // skip 2
  }
  private Z mP = super.next();

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.firstKey().compareTo(mP) > 0) {
      mA.put(mP, mP);
      mP = super.next();
    }
    final Map.Entry<Z, Z> e = mA.pollFirstEntry();
    if (e.getValue() != null) {
      mA.put(e.getKey().multiply(e.getValue()), e.getValue());
    }
    return e.getKey();
  }
}

