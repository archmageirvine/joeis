package irvine.oeis.a228;
// Generated by gen_seq4.pl convprom/convprod at 2023-07-10 14:24

import irvine.oeis.a003.A003781;
import irvine.oeis.a005.A005875;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A228745 Expansion of (phi(q)^4 + 7 * phi(-q)^4) / 8 in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A228745 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A228745() {
    super(0, "1,-1", new A003781(), new A005875());
  }
}
