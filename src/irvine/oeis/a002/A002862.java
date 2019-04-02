package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A002862 Number of nonisomorphic connected functions with no fixed points, or proper rings with n edges.
 * @author Sean A. Irvine
 */
public class A002862 extends A002861 {

  private final A000081 mS81 = new A000081();

  /** Construct the sequence. */
  public A002862() {
    super();
    mS81.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mS81.next());
  }
}

