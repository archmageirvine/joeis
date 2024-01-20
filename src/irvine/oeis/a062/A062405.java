package irvine.oeis.a062;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a060.A060715;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A062405 Sums of specific numbers when generating a type of triangle based on pi(x).
 * @author Sean A. Irvine
 */
public class A062405 extends Sequence0 {

  private int mN = -1;
  private final Sequence mA = new RunLengthTransform(new A060715().skip(1));

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> mA.next());
  }
}
