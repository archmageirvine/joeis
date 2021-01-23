package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a003.A003169;

/**
 * A007164 Number of P-graphs with 2n edges.
 * @author Sean A. Irvine
 */
public class A007164 extends A007163 {

  private final A003169 mP = new A003169();
  private final A007165 mH = new A007165();

  @Override
  public Z next() {
    return super.next().add(mP.next()).add(mH.next().multiply2()).divide(4);
  }
}
