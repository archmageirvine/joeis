package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A394508 Write the primes in a column. Add new columns to the right, with each entry being the prime whose index is the entry to its left. The sequence a(n) is given by the antidiagonal sums.
 * @author Sean A. Irvine
 */
public class A394508 extends Sequence1 {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (int k = 0; k < mA.length(); ++k) {
      mA.set(k, Functions.PRIME.z(mA.get(k)));
      sum = sum.add(mA.get(k));
    }
    mP = Functions.NEXT_PRIME.z(mP);
    mA.set(mA.length(), mP);
    return sum.add(mP);
  }
}
