package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.oeis.PrependSequence;
import irvine.oeis.a031.A031971;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068477 a(n) is the digital sum of 1^n + 2^n + ... + n^n.
 * @author Sean A. Irvine
 */
public class A068477 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068477() {
    super(0, new PrependSequence(new A031971(), 0), k -> Functions.DIGIT_SUM.z(k));
  }
}
