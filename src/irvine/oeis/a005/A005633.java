package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a122.A122748;
import irvine.oeis.a123.A123071;

/**
 * A005633 Bishops on an n X n board (see Robinson paper for details).
 * @author Sean A. Irvine
 */
public class A005633 extends AbstractSequence {

  private final A122748 mSeq1 = new A122748();

  /** Construct the sequence. */
  public A005633() {
    super(1);
  }

  private final Sequence mS = new A123071();
  private long mN = -1;

  {
    next();
  }

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 1) {
      return mSeq1.next().subtract(mS.next()).divide2();
    } else {
      return mSeq1.next().divide2();
    }
  }
}
