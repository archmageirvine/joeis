package irvine.oeis.a306;

import irvine.oeis.FiniteSequence;

/**
 * A306788 Numbers n such that all digits in n are different and for each digit d it is true that <code>n = d (mod</code> sum of <code>digits(n) - d)</code>.
 * @author Georg Fischer
 */
public class A306788 extends FiniteSequence {

  /** Construct the sequence. */
  public A306788() {
    super(287, 375, 485, 643, 735, 739, 827, 1276, 1453, 2531, 2537, 3187, 3251, 3540, 5413, 5783, 6138, 6315, 6571, 9381, 9817, 14053, 20176, 23961, 30618, 47908, 63015, 69324, 71842, 78142, 91826, 92361, 98301, 415826, 415829, 693024, 910824, 5481029);
  }
}
