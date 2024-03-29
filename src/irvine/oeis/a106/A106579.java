package irvine.oeis.a106;
// Generated by gen_seq4.pl tricut2

import irvine.oeis.a000.A000007;
import irvine.oeis.a033.A033877;
import irvine.oeis.triangle.PrependColumn;

/**
 * A106579 Triangular array associated with Schroeder numbers: T(0,0) = 1, T(n,0) = 0 for n &gt; 0; T(n,k) = 0 if k &lt; n; T(n,k) = T(n,k-1) + T(n-1,k-1) + T(n-1,k).
 * @author Georg Fischer
 */
public class A106579 extends PrependColumn {

  /** Construct the sequence. */
  public A106579() {
    super(0, new A033877(), new A000007());
  }
}

