package irvine.oeis.a084;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A084469 Position of A084467(n) in A084468(n).
 * @author Sean A. Irvine
 */
public class A084469 extends A084467 {

  private final Sequence mA = new A084468();
  private final Map<Z, Long> mMap = new HashMap<>();
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = super.next();
    while (!mMap.containsKey(t)) {
      mMap.put(mA.next(), ++mM);
    }
    return Z.valueOf(mMap.remove(t));
  }
}
