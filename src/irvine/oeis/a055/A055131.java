package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005098;

/**
 * A055131 Those composite s for which A055095[s] = 2.
 * @author Sean A. Irvine
 */
public class A055131 extends AbstractSequence {

  private final A005098 mSeq1 = new A005098();

  /** Construct the sequence. */
  public A055131() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(4).add(1).multiply(3);
  }
}
