package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A034050 Numbers with multiplicative digital root value 3.
 * @author Sean A. Irvine
 */
public class A034050 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final char mDigit;
  private int mN = -1;

  protected A034050(final char digit) {
    mDigit = digit;
  }

  /** Construct the sequence. */
  public A034050() {
    this('3');
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      for (int k = 0; k <= mN; ++k) {
        mA.add(new Z(StringUtils.rep('1', k) + mDigit + StringUtils.rep('1', mN - k)));
      }
    }
    return mA.pollFirst();
  }
}

