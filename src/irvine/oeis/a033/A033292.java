package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a143.A143689;

/**
 * A033292 A Connell-like sequence: take 1 number = 1 (mod Q), 2 numbers = 2 (mod Q), 3 numbers = 3 (mod Q), etc., where Q = 3.
 * @author Sean A. Irvine
 */
public class A033292 extends AbstractSequence {

  private final A143689 mSeq1 = new A143689();

  /** Construct the sequence. */
  public A033292() {
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
      mT = mT.add(3);
    }
    return mT;
  }
}

