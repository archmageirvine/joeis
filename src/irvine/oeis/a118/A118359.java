package irvine.oeis.a118;

import irvine.math.z.Z;
import irvine.oeis.a117.A117078;

/**
 * A118359 Primes for which the weight as defined in A117078 is 7 and the gap as defined in A001223 is 6.
 * @author Georg Fischer
 */
public class A118359 extends A117078 {

  private final Z mWeight;
  private final Z mGap;

  /** Construct the sequence. */
  public A118359() {
    this(1, 7, 6);
  }

  protected A118359(final int offset, final int weight, final int gap) {
    super(offset);
    mWeight = Z.valueOf(weight);
    mGap = Z.valueOf(gap);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p0 = mP1;
      mP1 = mPrime.nextPrime(mP1);
      final Z[] wg = compute(p0, mP1); // [0] is the weight, [1] is the gap
      if (wg[0].equals(mWeight) && wg[1].equals(mGap)) {
        return p0;
      }
    }
  }
}
