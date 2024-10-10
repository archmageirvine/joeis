package irvine.oeis.a072;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002808;

/**
 * A072553 Sigma of n-th composite number equals a(n)-th composite number if it is also a composite or equals zero if sigma[c] is prime.
 * @author Sean A. Irvine
 */
public class A072553 extends A002808 {

  private final Sequence mA = new A002808();
  private final HashMap<Z, Long> mInverse = new HashMap<>();
  private long mM = 0;

  @Override
  public Z next() {
    final Z sigma = Functions.SIGMA1.z(super.next());
    if (sigma.isProbablePrime()) {
      return Z.ZERO;
    }
    while (!mInverse.containsKey(sigma)) {
      mInverse.put(mA.next(), ++mM);
    }
    return Z.valueOf(mInverse.get(sigma));
  }
}
