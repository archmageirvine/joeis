package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000081;

/**
 * A002862 Number of nonisomorphic connected functions with no fixed points, or proper rings with n edges.
 * @author Sean A. Irvine
 */
public class A002862 extends Sequence1 {

  private final Sequence mA = new A002861().skip();
  private final A000081 mS81 = new A000081();

  /** Construct the sequence. */
  public A002862() {
    super();
    mS81.next();
  }

  @Override
  public Z next() {
    return mA.next().subtract(mS81.next());
  }
}

