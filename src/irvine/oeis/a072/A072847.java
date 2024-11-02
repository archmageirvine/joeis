package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A072847 The a(n)-th highly-composite number (A002182) is the first one divisible by 2^n.
 * @author Sean A. Irvine
 */
public class A072847 extends A002182 {

  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      ++mM;
      if (super.next().makeOdd().auxiliary() >= mN) {
        return Z.valueOf(mM);
      }
    }
  }
}
