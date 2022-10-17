package irvine.oeis.a155;

import irvine.oeis.a054.A054765;
import irvine.oeis.transform.InverseInvertTransform;

/**
 * A155728 INVERTi transform of A054765: (1, 3, 19, 160, 1744, ...).
 * @author Georg Fischer
 */
public class A155728 extends InverseInvertTransform {

  /** Construct the sequence. */
  public A155728() {
    super(1, new A054765(), 1);
  }
}
