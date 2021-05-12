package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000328;
import irvine.oeis.a046.A046109;

/**
 * A051132 Number of ordered pairs of integers (x,y) with x^2+y^2 &lt; n^2.
 * @author Sean A. Irvine
 */
public class A051132 extends A000328 {

  private final Sequence mA = new A046109();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
