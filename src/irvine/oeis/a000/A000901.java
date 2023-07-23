package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a037.A037223;
import irvine.oeis.a122.A122670;

/**
 * A000901 Number of solutions to the rook problem on a 2n X 2n board having a certain symmetry group (see Robinson for details).
 * @author Sean A. Irvine
 */
public class A000901 extends AbstractSequence {

  private final A037223 mSeq1 = new A037223();

  /** Construct the sequence. */
  public A000901() {
    super(1);
  }

  private final Sequence mA898 = new A000898();
  private final Sequence mA122670 = new A122670();

  {
    mA898.next();
    mA122670.next();
    mA122670.next();
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    mSeq1.next();
    mA122670.next();
    return mSeq1.next().subtract(mA898.next()).subtract(mA122670.next()).divide(4);
  }
}

