package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024140;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366707 Number of distinct prime divisors of 12^n - 1.
 * @author Sean A. Irvine
 */
public class A366707 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366707() {
    super(1, new A024140().skip(), k -> Z.valueOf(Functions.OMEGA.i(k)));
  }
}

