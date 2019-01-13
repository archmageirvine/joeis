package irvine.math.factorial;

import irvine.math.z.Integers;
import irvine.math.group.RingFactorial;
import irvine.math.z.Z;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Compute factorials and remember their values.
 *
 * @author Sean A. Irvine
 */
public class MemoryFactorial implements Factorial, Serializable {

  private static final RingFactorial<Z> MF = RingFactorial.instance(Integers.SINGLETON);

  @Override
  public Z factorial(final int n) {
    return MF.factorial(n);
  }

  private final ArrayList<Z> mDF = new ArrayList<>();
  {
    mDF.add(Z.ONE);
    mDF.add(Z.ONE);
  }

  @Override
  public Z doubleFactorial(final int n) {
    if (n == -1) {
      return Z.ONE; // special case
    }
    if (n < 0) {
      throw new IllegalArgumentException("n must be nonnegative");
    }
    while (n >= mDF.size()) {
      mDF.add(mDF.get(mDF.size() - 2).multiply(mDF.size()));
    }
    return mDF.get(n);
  }

}
