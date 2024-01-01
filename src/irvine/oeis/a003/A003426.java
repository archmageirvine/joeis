package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000055;
import irvine.oeis.a002.A002988;

/**
 * A003426 Number of stable trees with n nodes.
 * @author Sean A. Irvine
 */
public class A003426 extends A000055 {

  /** Construct the sequence. */
  public A003426() {
    super(1);
    super.next();
  }

  private long mN = 0;
  private final Sequence mB = new A002988().skip();

  @Override
  public Z next() {
    final Z v = super.next().subtract(mB.next());
    return ++mN <= 2 ? v.add(1) : v;
  }
}
