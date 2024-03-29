package irvine.oeis.a072;
// Generated by gen_seq4.pl cordrectab/cordrec at 2022-07-15 23:04

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A072042 a(n+2) = a(n+1)*a(n)*(1+1/n), a(1)=a(2)=1.
 * <code>a(n+2)=a(n+1)*a(n)*(1+1/n)</code>
 * @author Georg Fischer
 */
public class A072042 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A072042() {
    super(1, 2, 2, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n + 1).multiply(a(n)).add(a(n + 1).multiply(a(n)).divide(n));
  }
}
