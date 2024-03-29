package irvine.oeis.a304;
// Generated by gen_seq4.pl convprod at 2023-02-24 23:06

import irvine.oeis.a034.A034691;
import irvine.oeis.a098.A098407;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A304962 Expansion of Product_{k&gt;=1} ((1 + x^k)/(1 - x^k))^(2^(k-1)).
 * @author Georg Fischer
 */
public class A304962 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A304962() {
    super(0, "1,1", new A034691(), new A098407());
  }
}
