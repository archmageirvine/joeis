package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A079101.
 * @author Sean A. Irvine
 */
public class A079350 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A079350() {
    super(1, new A079342(), Functions.LOOK_AND_SAY::z);
  }
}

