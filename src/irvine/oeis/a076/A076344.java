package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001358;

/**
 * A076344 A076341(A001358(n)), imaginary part of semiprimes mapped as defined in A076340, A076341.
 * @author Sean A. Irvine
 */
public class A076344 extends A076341 {

  private final Sequence mA = new A001358();

  @Override
  public Z next() {
    return a(mA.next());
  }
}
