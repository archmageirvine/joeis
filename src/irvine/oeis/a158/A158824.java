package irvine.oeis.a158;
// manually tricut2  2023-07-31

import irvine.oeis.a000.A000292;
import irvine.oeis.a104.A104633;
import irvine.oeis.triangle.PrependColumn;

/**
 * A158824 Triangle T(n,k) = A000292(n) if k = 1 otherwise (k-1)*(n-k+1)*(n-k+2)/2, read by rows.
 * @author Georg Fischer
 */
public class A158824 extends PrependColumn {

  /** Construct the sequence. */
  public A158824() {
    super(1, new A104633(), new A000292().skip(1));
  }
}

