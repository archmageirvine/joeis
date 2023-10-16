package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a024.A024049;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366611 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A366611 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366611() {
    super(1, new A024049().skip(), k -> Z.valueOf(Jaguar.factor(k).omega()));
  }
}

