package irvine.oeis.a339;

import irvine.math.z.Z;
import irvine.oeis.a401.A401210;

/**
 * A339836 Number of bicolored graphs on n unlabeled nodes such that every white node is adjacent to a black node.
 * @author Gregory Morse
 */
public class A339836 extends A401210 {
  private final boolean mFreeBlack;
  private int mN = -1;

  protected A339836(final boolean freeBlack) {
    mFreeBlack = freeBlack;
  }

  /** Construct the sequence. */
  public A339836() {
    this(true);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(colored(mN, k, mFreeBlack, true));
    }
    return sum;
  }
}
