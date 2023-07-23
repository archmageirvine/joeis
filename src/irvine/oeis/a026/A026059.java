package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A026059 a(n) = (d(n)-r(n))/5, where d = A026057 and r is the periodic sequence with fundamental period (1,0,3,1,0).
 * @author Sean A. Irvine
 */
public class A026059 extends AbstractSequence {

  private final A026057 mSeq1 = new A026057();

  /** Construct the sequence. */
  public A026059() {
    super(4);
  }

  private final Sequence mS = new PeriodicSequence(1, 0, 3, 1, 0);

  {
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mS.next()).divide(5);
  }
}

