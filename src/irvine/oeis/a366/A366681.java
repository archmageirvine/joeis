package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a024.A024127;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366681 Number of distinct prime divisors of 11^n - 1.
 * @author Sean A. Irvine
 */
public class A366681 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366681() {
    super(1, new A024127().skip(), k -> Z.valueOf(Jaguar.factor(k).omega()));
  }
}

