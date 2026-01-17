package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.oeis.a391.A391796;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A392104 a(n) = prime(A391796(n)).
 * @author Sean A. Irvine
 */
public class A392104 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A392104() {
    super(1, new A391796(), Functions.PRIME::z);
  }
}

