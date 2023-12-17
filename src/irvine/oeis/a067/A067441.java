package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a065.A065565;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A067229.
 * @author Sean A. Irvine
 */
public class A067441 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A067441() {
    super(1, new A065565().skip(), k -> Z.valueOf(Jaguar.factor(k).omega()));
  }
}
