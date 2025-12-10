package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A037897 a(n) = (Greatest base 3 digit of n) - (least base 3 digit of n).
 * @author Sean A. Irvine
 */
public class A037897 extends AbstractSequence {

  private Z mN;
  private final int mBase;

  protected A037897(final int offset, final int base) {
    super(offset);
    mBase = base;
    mN = Z.valueOf(offset - 1);
  }

  /** Construct the sequence. */
  public A037897() {
    this(0, 3);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(Functions.DIGIT_SORT_ASCENDING.z(mBase, mN).mod(mBase) - Functions.DIGIT_SORT_DESCENDING.z(mBase, mN).mod(mBase));
  }
}
