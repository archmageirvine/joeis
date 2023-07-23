package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a054.A054552;

/**
 * A033293 A Connell-like sequence: take 1 number = 1 (mod Q), 2 numbers = 2 (mod Q), 3 numbers = 3 (mod Q), etc., where Q = 8.
 * @author Sean A. Irvine
 */
public class A033293 extends AbstractSequence {

  private final A054552 mSeq1 = new A054552();

  /** Construct the sequence. */
  public A033293() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = mN++;
      mT = mSeq1.next();
    } else {
      mT = mT.add(8);
    }
    return mT;
  }
}

