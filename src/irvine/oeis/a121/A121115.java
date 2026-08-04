package irvine.oeis.a121;
// manually 2026-08-04/convprod at 2026-08-04 16:27

import irvine.oeis.PrependSequence;
import irvine.oeis.a036.A036758;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A121115 Related to enumeration of rooted catapolyoctagons (see Cyvin reference for precise definition).
 * @author Georg Fischer
 */
public class A121115 extends PrependSequence {

  /** Construct the sequence. */
  public A121115() {
    super(1, new ConvolutionProduct(1, "2", new A036758()), 0);
  }
}
