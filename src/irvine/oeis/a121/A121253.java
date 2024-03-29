package irvine.oeis.a121;
// Generated by gen_seq4.pl somos3/cordrec at 2022-06-03 23:26

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A121253 a(n) = a(n-1)*a(n-3)+1 with a(0)=a(1)=a(2)=0.
 * @author Georg Fischer
 */
public class A121253 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A121253() {
    super(0, 3, 0, 0, 0, 0);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(a(n - 3)).add(Z.ONE);
  }
}
