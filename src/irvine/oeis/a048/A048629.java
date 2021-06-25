package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002476;
import irvine.oeis.a007.A007528;

/**
 * A048629 n-th 6k+1 prime times n-th 6k-1 prime.
 * @author Sean A. Irvine
 */
public class A048629 extends A002476 {

  private final Sequence mA = new A007528();

  @Override
  public Z next() {
    return super.next().multiply(mA.next());
  }
}

