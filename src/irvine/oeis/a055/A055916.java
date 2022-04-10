package irvine.oeis.a055;

import irvine.oeis.FiniteSequence;

/**
 * A055916 Coefficients of a polynomial used in calculation of A055913.
 * @author Georg Fischer
 */
public class A055916 extends FiniteSequence {

  static final long[] TERMS = {1, 6, 19, 65, 164, 358, 763, 1377, 2474, 3936, 6181, 8979, 12546, 16753, 21422, 26258, 31321, 34969, 39772, 40007, 44030, 39493, 42663, 33716, 36011, 24891, 26363, 15853, 16467, 8717, 8644, 4115, 3667, 1683, 1201, 581, 281, 154, 51, 21, 10, 0, 1};

  /** Construct the sequence. */
  public A055916() {
    super(TERMS);
  }
}
