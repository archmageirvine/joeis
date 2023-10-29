package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002504 Numbers x such that 1 + 3*x*(x-1) is a ("cuban") prime (cf. A002407).
 * @author Sean A. Irvine
 */
public class A002504 extends Sequence1 {

  private Z mN = Z.ONE;
  
  @Override
  public Z next() {
    while (true) {
      final Z t = mN;
      mN = mN.add(1);
      if (t.multiply(mN).multiply(3).add(1).isPrime()) {
        return mN;
      }
    }
  }
}
