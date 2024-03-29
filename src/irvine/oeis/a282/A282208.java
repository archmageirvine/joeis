package irvine.oeis.a282;
// Generated by gen_seq4.pl eisenprod/convprod at 2023-02-23 22:13

import irvine.oeis.a004.A004009;
import irvine.oeis.a006.A006352;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A282208 Coefficients in q-expansion of E_2^2*E_4, where E_2 and E_4 are respectively the Eisenstein series A006352 and A004009.
 * @author Georg Fischer
 */
public class A282208 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A282208() {
    super(0, "+2,+1", new A006352(), new A004009());
  }
}
