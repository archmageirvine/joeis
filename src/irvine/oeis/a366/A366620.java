package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a024.A024062;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366620 Number of distinct prime divisors of 6^n - 1.
 * @author Sean A. Irvine
 */
public class A366620 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366620() {
    super(1, new A024062().skip(), k -> Z.valueOf(Jaguar.factor(k).omega()));
  }
}

