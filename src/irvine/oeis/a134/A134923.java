package irvine.oeis.a134;
// Generated by gen_seq4.pl cordrectab/cordrec at 2022-07-14 22:55

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A134923 a(n) = (a(n-1)+a(n-2))^3, for n&gt;=2; a(0)=0,a(1)=1.
 * <code>a(n)=(a(n-1)+a(n-2))^3</code>
 * @author Georg Fischer
 */
public class A134923 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A134923() {
    super(0, 2, 0, 0, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).add(a(n - 2)).pow(3);
  }
}
