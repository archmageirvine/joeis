package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001405;
import irvine.oeis.a002.A002944;

/**
 * A048619 a(n) = LCM(binomial(n,0), ..., binomial(n,n)) / binomial(n,floor(n/2)).
 * @author Sean A. Irvine
 */
public class A048619 extends A002944 {

  /** Construct the sequence. */
  public A048619() {
    super(0);
  }

  private final Sequence mA = new A001405();

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}

