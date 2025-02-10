package irvine.oeis.a075;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014486;

/**
 * A075169 Position of A014486(n) in A075170.
 * @author Sean A. Irvine
 */
public class A075169 extends A014486 {

  private final Sequence mA = new A075170();
  private final HashMap<Z, Long> mM = new HashMap<>();
  private long mPos = -1;

  @Override
  public Z next() {
    final Z tree = super.next();
    while (true) {
      final Long v = mM.remove(tree);
      if (v != null) {
        return Z.valueOf(v);
      }
      mM.put(mA.next(), ++mPos);
    }
  }
}
