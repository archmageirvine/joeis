package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A035488 3rd column of Stolarsky array.
 * @author Sean A. Irvine
 */
public class A035488 extends AbstractSequence {

  private final A035487 mSeq1 = new A035487();

  /** Construct the sequence. */
  public A035488() {
    super(0);
  }

  @Override
  public Z next() {
    return CR.valueOf(mSeq1.next()).multiply(CR.PHI).round();
  }
}

