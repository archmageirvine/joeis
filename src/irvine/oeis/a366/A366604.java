package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024036;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366604 Number of distinct prime divisors of 4^n - 1.
 * @author Sean A. Irvine
 */
public class A366604 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366604() {
    super(1, new A024036().skip(), k -> Z.valueOf(Functions.OMEGA.i(k)));
  }
}

