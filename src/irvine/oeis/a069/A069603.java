package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069603 a(1) = 2; a(n) = smallest number such that the juxtaposition a(1)a(2)...a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A069603 extends Sequence1 {

  private final Z mStart;
  private Z mA = null;

  protected A069603(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A069603() {
    this(Z.TWO);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
      return mStart;
    }
    long k = -1;
    long mul = 10;
    mA = mA.multiply(10);
    while (true) {
      k += 2;
      if (k >= mul) {
        mul *= 10;
        mA = mA.multiply(10);
      }
      final Z t = mA.add(k);
      if (t.isProbablePrime()) {
        mA = t;
        return Z.valueOf(k);
      }
    }
  }
}
