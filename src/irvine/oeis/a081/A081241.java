package irvine.oeis.a081;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007931;

/**
 * A081241 Position in B of reversal of n-th term of B, where B is the logic-binary sequence, A007931.
 * @author Sean A. Irvine
 */
public class A081241 extends A007931 {

  private final Sequence mA = new A007931();
  private final HashMap<Z, Long> mInverse = new HashMap<>();
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = Functions.REVERSE.z(super.next());
    while (!mInverse.containsKey(t)) {
      mInverse.put(mA.next(), ++mM);
    }
    return Z.valueOf(mInverse.remove(t));
  }
}
