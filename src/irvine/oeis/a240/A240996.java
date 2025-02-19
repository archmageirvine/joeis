package irvine.oeis.a240;
// Generated by gen_seq4.pl 2025-01-27.ack/convprod at 2025-01-27 21:28

import irvine.oeis.a088.A088223;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A240996 G.f. satisfies: A(x)^2 = x + A(x*A(x)^2).
 * @author Georg Fischer
 */
public class A240996 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A240996() {
    super(0, "1/2", new A088223());
  }
}
