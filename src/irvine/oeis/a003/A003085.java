package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A003085 Number of connected digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A003085 extends MobiusTransformSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A003085() {
    super(new A003084(), 0, Z.ONE);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
