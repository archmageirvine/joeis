package irvine.oeis.a393;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.a003.A003961;
import irvine.oeis.a025.A025487;
import irvine.oeis.a147.A147516;

/**
 * A393258 allocated for David A. Corneth.
 * @author Sean A. Irvine
 */
public class A393258 extends A025487 {

  private final A003961 mA = new A003961();
  private final A147516 mB = new A147516();
  private final HashMap<Z, Long> mInverse = new HashMap<>();
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = super.next();
    final Z u = mA.a(t);
    while (!mInverse.containsKey(u)) {
      mInverse.put(mB.next(), ++mM);
    }
    return Z.valueOf(mInverse.get(u));
  }
}
