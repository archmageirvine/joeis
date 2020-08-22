package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a018.A018252;

/**
 * A022797 n-th prime + n-th nonprime.
 * @author Sean A. Irvine
 */
public class A022797 implements Sequence {

  private final Sequence mA = new A000040();
  private final Sequence mB = new A018252();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
