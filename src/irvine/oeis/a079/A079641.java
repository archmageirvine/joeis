package irvine.oeis.a079;
// Generated by gen_seq4.pl tricut1

import irvine.oeis.a129.A129062;
import irvine.oeis.triangle.TruncatedTriangle;

/**
 * A079641 Matrix product of Stirling2-triangle A008277(n,k) and unsigned Stirling1-triangle |A008275(n,k)|.
 * @author Georg Fischer
 */
public class A079641 extends TruncatedTriangle {

  /** Construct the sequence. */
  public A079641() {
    super(1, new A129062());
  }
}

