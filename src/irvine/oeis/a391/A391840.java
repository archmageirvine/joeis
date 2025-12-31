package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A391840 allocated for Kaloian Ivanov.
 * @author Sean A. Irvine
 */
public class A391840 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A391840() {
    super(new A000040(), k -> Functions.DIGIT_SUM.z(16, k));
  }
}
