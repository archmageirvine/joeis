package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002212;
import irvine.oeis.a039.A039660;

/**
 * A045905 Catafusenes (see reference for precise definition).
 * @author Sean A. Irvine
 */
public class A045905 extends AbstractSequence {

  private final A045829 mSeq1 = new A045829();

  /** Construct the sequence. */
  public A045905() {
    super(0);
  }

  private final Sequence mB = new A045445();
  private final Sequence mC = new A002212();
  private final Sequence mD = new A039660();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mC.next();
      return Z.ZERO;
    }
    Z t = mSeq1.next().add(mD.next().multiply2());
    if ((mN & 1) == 0) {
      t = t.add(mB.next().multiply(3));
      if ((mN & 3) == 0) {
        t = t.add(mC.next().multiply2());
      }
    }
    return t.divide(8);
  }
}
