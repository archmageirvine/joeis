package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084971.
 * @author Sean A. Irvine
 */
public class A084975 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084975() {
    super(1, new A084974(), Functions.NEXT_PRIME::z);
  }
}
