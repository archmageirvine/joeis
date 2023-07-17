package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a001.A001233;

/**
 * A052779 Expansion of e.g.f.: (log(1-x))^6.
 * @author Sean A. Irvine
 */
public class A052779 extends A001233 {

  /** Construct the sequence. */
  public A052779() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 6 ? Z.ZERO : super.next().multiply(720);
  }
}
