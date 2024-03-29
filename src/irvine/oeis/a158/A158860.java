package irvine.oeis.a158;
// Generated by gen_seq4.pl tricut2

import irvine.oeis.a004.A004736;
import irvine.oeis.a016.A016777;
import irvine.oeis.triangle.PrependColumn;

/**
 * A158860 Triangle T(n,k)= ( 1 +T(n-1,k)*T(n,k-1) ) / T(n-1,k-1) initialized by T(n,0)=3n-2, T(n,k)=0 if k&gt;=n, read by rows 0&lt;=k&lt;n.
 * @author Georg Fischer
 */
public class A158860 extends PrependColumn {

  /** Construct the sequence. */
  public A158860() {
    super(1, new A004736(), new A016777());
  }
}

