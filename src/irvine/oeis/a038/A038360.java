package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a000.A000931;

/**
 * A038360 Ranks of certain relations among Euler sums of weight n.
 * @author Sean A. Irvine
 */
public class A038360 extends A000079 {

  /** Construct the sequence. */
  public A038360() {
    super(3);
  }

  private final Sequence mA = new A000931().skip(6);

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
