package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a064.A064628;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A067438 Number of distinct prime factors in floor((4/3)^n).
 * @author Sean A. Irvine
 */
public class A067438 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A067438() {
    super(1, new A064628().skip(), k -> Z.valueOf(Jaguar.factor(k).omega()));
  }
}
