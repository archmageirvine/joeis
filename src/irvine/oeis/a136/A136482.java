package irvine.oeis.a136;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;
import irvine.oeis.a034.A034851;

/**
 * A136482 Triangle read by rows: T(n,k) = 2*A007318(n,k) - A034851(n,k) (i.e., twice Pascal&apos;s triangle - the Losanitch triangle).
 * @author Georg Fischer
 */
public class A136482 extends A007318 {

  private final A034851 mSeq2 = new A034851();

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mSeq2.next());
  }
}
