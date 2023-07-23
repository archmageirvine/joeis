package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a018.A018252;

/**
 * A025543 Least common multiple of the first n composite numbers.
 * @author Sean A. Irvine
 */
public class A025543 extends AbstractSequence {

  private final A018252 mSeq1 = new A018252();

  /** Construct the sequence. */
  public A025543() {
    super(0);
  }

  private Z mL = Z.ONE;

  @Override
  public Z next() {
    mL = mL.lcm(mSeq1.next());
    return mL;
  }
}
