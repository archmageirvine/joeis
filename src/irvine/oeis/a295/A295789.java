package irvine.oeis.a295;
// Generated by gen_seq4.pl eisenprod/convprod at 2023-02-23 22:13

import irvine.oeis.a006.A006352;
import irvine.oeis.a013.A013974;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A295789 Coefficients in expansion of (E_2^10/E_10)^(1/4).
 * @author Georg Fischer
 */
public class A295789 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A295789() {
    super(0, "+10/4,-1/4", new A006352(), new A013974());
  }
}
