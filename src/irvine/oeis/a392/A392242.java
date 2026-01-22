package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A392242 allocated for Michael S. Branicky.
 * @author Sean A. Irvine
 */
public class A392242 extends FilterSequence {

  private int mCount = 0;

  /** Construct the sequence. */
  public A392242() {
    super(1, new A000290(), k -> Functions.MAX.i(ZUtils.digitCounts(k)) <= 1);
  }

  @Override
  public Z next() {
    if (mCount == 611) {
      return null;
    }
    ++mCount;
    return super.next();
  }
}
