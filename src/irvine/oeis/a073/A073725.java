package irvine.oeis.a073;

import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002808;

/**
 * A073725 a(n)-th composite number = phi(n-th composite number); a(1)=a(2)=0.
 * @author Sean A. Irvine
 */
public class A073725 extends A002808 {

  private final Map<Z, Long> mCompositeToIndex = new HashMap<>();
  private final Sequence mComp = new A002808();
  private long mM = 0;

  @Override
  public Z next() {
    final Z c = super.next();
    final Z phi = Functions.PHI.z(c);
    if (phi.isProbablePrime()) {
      return Z.ZERO;
    }
    while (!mCompositeToIndex.containsKey(phi)) {
      mCompositeToIndex.put(mComp.next(), ++mM);
    }
    return Z.valueOf(mCompositeToIndex.get(phi));
  }
}
