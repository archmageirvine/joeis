package irvine.oeis.a072;

import irvine.oeis.recur.PaddingSequence;

/**
 * A072996 Coefficient of the highest power of q in the expansion of nu(0)=1, nu(1)=b and for n&gt;=2, nu(n)=b*nu(n-1)+lambda*(n-1)_q*nu(n-2) with (b,lambda)=(2, 1), where (n)_q=(1+q+...+q^(n-1)) and q is a root of unity.
 * @author Georg Fischer
 */
public class A072996 extends PaddingSequence {

  /** Construct the sequence. */
  public A072996() {
    super("1, 1", "5, 2");
  }
}
