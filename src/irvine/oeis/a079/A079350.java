package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A079350 "Look and Say" (or LS) transform of A079342(n). These terms are such that A079342(n) divides a(n).
 * @author Sean A. Irvine
 */
public class A079350 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A079350() {
    super(1, new A079342(), Functions.LOOK_AND_SAY::z);
  }
}

