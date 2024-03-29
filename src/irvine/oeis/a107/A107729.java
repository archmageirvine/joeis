package irvine.oeis.a107;
// Generated by gen_seq4.pl tricut1

import irvine.oeis.a155.A155100;
import irvine.oeis.triangle.TruncatedTriangle;

/**
 * A107729 Triangle T(n,k), 0 &lt;= k &lt;= n, read by rows, defined by T(0,0) = 1; T(0,k) = 0 if k &lt; 0 or if k &gt; 0; T(n,k) = k*T(n-1,k-1) + (k+2)*T(n-1,k+1).
 * @author Georg Fischer
 */
public class A107729 extends TruncatedTriangle {

  /** Construct the sequence. */
  public A107729() {
    super(0, new A155100());
  }
}

