package irvine.oeis.a165;

import irvine.math.z.Z;
import irvine.oeis.InterleaveSequence;
import irvine.oeis.a002.A002445;
import irvine.oeis.a141.A141421;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A165823 Large denominators of Bernoulli numbers. Mix A002445, 2*A141421 .
 * @author Sean A. Irvine
 */
public class A165823 extends InterleaveSequence {

  /** Construct the sequence. */
  public A165823() {
    super(0, new A002445(), new SimpleTransformSequence(new A141421(), Z::multiply2));
  }
}
