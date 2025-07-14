package irvine.oeis.a078;

import java.util.function.Function;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000215;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078726 Fermat numbers 2^(2^n) + 1 with digits sorted in increasing order and zeros suppressed.
 * @author Sean A. Irvine
 */
public class A078726 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078726() {
    super(0, new A000215(), (Function<Z, Z>) Functions.DIGIT_SORT_ASCENDING::z);
  }
}
