package irvine.oeis.a305;
// manually cordrectab/cordrec at 2022-07-14 22:52

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A305851 a(n) = (a(n-1)+a(n-2))^(n-2) with a(1)=a(2)=1.
 * <code>a(n)=(a(n-1)+a(n-2))^(n-2)</code>
 * @author Georg Fischer
 */
public class A305851 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A305851() {
    super(1, 2, 0, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).add(a(n - 2)).pow(n - 2);
  }
}
