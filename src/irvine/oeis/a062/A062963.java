package irvine.oeis.a062;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a023.A023022;

/**
 * A062963 Mu(n) * H(n) where H(n) is A023022.
 * @author Sean A. Irvine
 */
public class A062963 extends AbstractSequence {

  private final A023022 mSeq1 = new A023022();

  /** Construct the sequence. */
  public A062963() {
    super(3);
  }

  private long mN = 2;

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(Mobius.mobius(++mN));
  }
}

