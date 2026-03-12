package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084108 A014486-indices of "Complete Binary Trees".
 * @author Sean A. Irvine
 */
public class A084108 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084108() {
    super(0, new A084107(), Functions.GLOBAL_CATALAN_RANK::z);
  }
}
