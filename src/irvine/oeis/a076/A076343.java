package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001358;

/**
 * A076343 A076340(A001358(n)), real part of semiprimes mapped as defined in A076340, A076341.
 * @author Sean A. Irvine
 */
public class A076343 extends A076340 {

  private final Sequence mA = new A001358();

  @Override
  public Z next() {
    return a(mA.next());
  }
}
