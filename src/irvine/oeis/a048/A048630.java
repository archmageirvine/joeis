package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002144;
import irvine.oeis.a002.A002145;

/**
 * A048630 n-th 4k+1 prime times n-th 4k-1 prime.
 * @author Sean A. Irvine
 */
public class A048630 extends A002144 {

  private final Sequence mA = new A002145();

  @Override
  public Z next() {
    return super.next().multiply(mA.next());
  }
}

