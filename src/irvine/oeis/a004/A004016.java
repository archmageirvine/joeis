package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002324;

/**
 * A004016 Theta series of planar hexagonal lattice A_2.
 * @author Sean A. Irvine
 */
public class A004016 extends AbstractSequence {

  private final A002324 mSeq1 = new A002324();

  /** Construct the sequence. */
  public A004016() {
    super(0);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return mSeq1.next().multiply(6);
  }
}
