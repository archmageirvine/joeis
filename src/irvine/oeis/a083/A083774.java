package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083774 Diagonal of A083773.
 * @author Sean A. Irvine
 */
public class A083774 extends Sequence1 {

  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ONE;
    }
    if (mN == 0) {
      return Z.TWO;
    }
    // Second to last term of row
    final Z fac = Functions.FACTORIAL.z(mN);
    long i = mN;
    while (!fac.multiply(++i).add(1).isProbablePrime()) {
      // do nothing
    }
    // Final term of the row
    boolean fails = true;
    final Z fi = fac.multiply(i);
    long j = i;
    while (fails) {
      ++j;
      final Z t = fi.multiply(j);
      fails = !fac.multiply(j).add(1).isProbablePrime();
      long k = 1;
      while (!fails && k <= mN) {
        if (t.divide(k).add(1).isProbablePrime()) {
          ++k;
        } else {
          fails = true;
        }
      }
    }
    return Z.valueOf(j);
  }
}
