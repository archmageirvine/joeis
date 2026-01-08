package irvine.oeis.a392;

import java.util.Collections;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392038.
 * @author Sean A. Irvine
 */
public class A392217 extends Sequence1 {

  private long mN = 0;
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      Collections.addAll(mA, Jaguar.factor(Functions.PHI.l(++mN)).divisors());
    }
    return mA.pollFirst();
  }
}

