package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000016;
import irvine.oeis.a000.A000048;

/**
 * A053734 A000016-A000048 (when they are lined up so that the two 16's match).
 * @author Sean A. Irvine
 */
public class A053734 extends A000016 {

  /** Construct the sequence. */
  public A053734() {
    super(1);
  }

  private final Sequence mA = new A000048();

  {
    next(); // skip 0th
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
