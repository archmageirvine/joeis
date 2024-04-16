package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024075;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366632 Number of distinct prime divisors of 7^n - 1.
 * @author Sean A. Irvine
 */
public class A366632 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366632() {
    super(1, new A024075().skip(), k -> Z.valueOf(Functions.OMEGA.i(k)));
  }
}

