package irvine.oeis.a126;
// Generated by gen_seq4.pl cordrectab/cordrec at 2022-07-14 22:55

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A126023 a(0)=0, a(1)=1; for n&gt;1, a(n) = a(n-1)*(a(n-1)+a(n-2)).
 * <code>a(n)=a(n-1)*(a(n-1)+a(n-2))</code>
 * @author Georg Fischer
 */
public class A126023 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A126023() {
    super(0, 2, 0, 0, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply((a(n - 1)).add(a(n - 2)));
  }
}
