package irvine.oeis.a185;
// manually 2024-05-04/invtraf at 2024-05-08 10:11

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001316;
import irvine.oeis.transform.InvertTransform;

/**
 * A185696 Eigensequence for the Gould sequence triangle (with general term A001316(n-k) if k&lt;=n, 0 otherwise).
 * @author Georg Fischer
 */
public class A185696 extends InvertTransform {

  /** Construct the sequence. */
  public A185696() {
    super(0, new PrependSequence(new A001316(), 0), 0, 0);
  }
}
