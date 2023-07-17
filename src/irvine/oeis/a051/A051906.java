package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a007.A007705;

/**
 * A051906 Number of ways of placing n nonattacking queens on an n X n toroidal chessboard.
 * @author Sean A. Irvine
 */
public class A051906 extends A007705 {

  /** Construct the sequence. */
  public A051906() {
    super(1);
  }

  private boolean mEven = false;

  @Override
  public Z next() {
    mEven = !mEven;
    return mEven ? super.next() : Z.ZERO;
  }
}
