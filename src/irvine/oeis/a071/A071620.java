package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.oeis.a176.A176942;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A060315.
 * @author Sean A. Irvine
 */
public class A071620 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071620() {
    super(new A176942(), k -> Functions.DIGIT_LENGTH.z(k));
  }
}
