package irvine.oeis.a366;

import irvine.math.z.Z;
import irvine.oeis.a001.A001203;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366397 Decimal expansion of the number whose continued fraction terms are one larger than those of Pi.
 * @author Sean A. Irvine
 */
public class A366397 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A366397() {
    super(1, new SimpleTransformSequence(new A001203(), Z.ONE::add));
  }
}
