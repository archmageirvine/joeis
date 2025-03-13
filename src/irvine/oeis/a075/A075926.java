package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A075926 List of codewords in binary lexicode with Hamming distance 3 written as decimal numbers.
 * @author Sean A. Irvine
 */
public class A075926 extends Sequence0 {

  private final DynamicLongArray mWords = new DynamicLongArray();
  private final int mWeight;
  private long mM = -1;
  private int mN = -1;

  protected A075926(final int weight) {
    mWeight = weight;
  }

  /** Construct the sequence. */
  public A075926() {
    this(3);
  }

  private boolean is(final long m) {
    for (int k = mN - 1; k >= 0; --k) {
      if (Long.bitCount(mWords.get(k) ^ m) < mWeight) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(++mM)) {
        mWords.set(mN, mM);
        return Z.valueOf(mM);
      }
    }
  }
}
