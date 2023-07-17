package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006880;

/**
 * A057835 Difference between pi(10^n) and the integer nearest to 10^n / log(10^n).
 * @author Sean A. Irvine
 */
public class A057835 extends A006880 {

  /** Construct the sequence. */
  public A057835() {
    super(1);
  }

  private final Sequence mA = new A057834();

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
