package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002262;
import irvine.oeis.a003.A003056;

/**
 * A079219 Triangle T(n,d) (listed row-wise: T(1,1)=1, T(2,1)=1, T(2,2)=1, T(3,1)=2, T(3,2)=0, T(3,3)=1, ...) giving the number of n-edge general plane trees with root degree d that are fixed by the three-fold application of Catalan Automorphisms A057511/A057512 (Deep rotation of general parenthesizations/plane trees).
 * @author Sean A. Irvine
 */
public class A079219 extends A079216 {

  private final Sequence mS = new A003056();
  private final Sequence mT = new A002262();

  @Override
  public Z next() {
    return pFixedByA057511(mS.next().intValueExact() + 1, 3, mT.next().intValueExact() + 1);
  }
}
