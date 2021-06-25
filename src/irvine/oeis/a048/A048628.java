package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002144;
import irvine.oeis.a002.A002145;

/**
 * A048628 n-th 4k+1 prime times (n+1)st 4k+3 prime.
 * @author Sean A. Irvine
 */
public class A048628 extends A002144 {

  private final Sequence mA = new SkipSequence(new A002145(), 1);

  @Override
  public Z next() {
    return super.next().multiply(mA.next());
  }
}

