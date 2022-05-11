package irvine.oeis.a056;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A056824 Numbers of the form p^(2k+1), p prime, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A056824 extends A000040 {

  private final TreeMap<Z, Z> mA = new TreeMap<>();
  private Z mP = super.next();

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.firstKey().compareTo(mP.pow(3)) > 0) {
      mA.put(mP.pow(3), mP.square());
      mP = super.next();
    }
    final Map.Entry<Z, Z> e = mA.pollFirstEntry();
    mA.put(e.getKey().multiply(e.getValue()), e.getValue());
    return e.getKey();
  }
}

