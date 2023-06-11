package irvine.oeis.a139;
// manually diffseq at 2023-06-11 08:33

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000668;

/**
 * A139236 Second differences of even superperfect numbers A061652.
 * @author Georg Fischer
 */
public class A139236 extends DifferenceSequence {

  /** Construct the sequence. */
  public A139236() {
    super(1, new DifferenceSequence(new A000668()));
  }

  @Override
  public Z next() {
    return super.next().divide(2);
  }
}
