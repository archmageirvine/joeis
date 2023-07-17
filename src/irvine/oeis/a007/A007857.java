package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A007857 Number of independent sets in rooted plane trees on n nodes.
 * @author Sean A. Irvine
 */
public class A007857 extends A007226 {

  /** Construct the sequence. */
  public A007857() {
    super(1);
  }

  private final A000108 mC = new A000108();

  @Override
  public Z next() {
    return super.next().subtract(mC.next());
  }
}
