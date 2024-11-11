package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073034 Take A000040, omit commas: 23571113171923..., select 1-digit primes.
 * @author Sean A. Irvine
 */
public class A073034 extends A000040 {

  private final int mLength;
  private StringBuilder mP = new StringBuilder();

  protected A073034(final int length) {
    mLength = length;
  }

  /** Construct the sequence. */
  public A073034() {
    this(1);
  }

  @Override
  public Z next() {
    while (true) {
      while (mLength >= mP.length()) {
        mP.append(super.next());
      }
      final Z t = new Z(mP.substring(0, mLength));
      mP.deleteCharAt(0);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
