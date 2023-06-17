package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000602 Number of n-node unrooted quartic trees; number of n-carbon alkanes C(n)H(2n+2) ignoring stereoisomers.
 * @author Sean A. Irvine
 */
public class A000602 extends AbstractSequence {

  /** Construct the sequence. */
  public A000602() {
    super(0);
  }

  private final A000022 mA22 = new A000022();
  private final A000200 mA200 = new A000200();
  private boolean mFirst = true;

  @Override
  public Z next() {
    final Z r = mA22.next().add(mA200.next());
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return r;
  }
}

