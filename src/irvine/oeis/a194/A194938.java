package irvine.oeis.a194;
// Generated by gen_seq4.pl tricut2

import irvine.oeis.a000.A000007;
import irvine.oeis.a039.A039692;
import irvine.oeis.triangle.PrependColumn;

/**
 * A194938 Triangle read by rows: coefficients of polynomials p(x,n) defined by 1/(1-t-t^2)^x = Sum_{n=1..oo} p(x,n)*t^n/n!.
 * @author Georg Fischer
 */
public class A194938 extends PrependColumn {

  /** Construct the sequence. */
  public A194938() {
    super(1, new A039692(), new A000007());
  }
}

