package irvine.oeis.a121;
// manually 2026-08-04/convprod at 2026-08-04 16:27

import irvine.oeis.PrependSequence;
import irvine.oeis.a036.A036759;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A121118 Related to enumeration of rooted catapolyoctagons (see Cyvin reference for precise definition).
 * @author Georg Fischer
 */
public class A121118 extends PrependSequence {

  /** Construct the sequence. */
  public A121118() {
    super(1, new ConvolutionProduct(1, "2", new A036759()), 0);
  }
}
