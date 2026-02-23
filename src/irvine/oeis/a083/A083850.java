package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A083850 Exponent of highest power of 11 dividing the n-th decimal palindrome; a(0) = 1.
 * @author Sean A. Irvine
 */
public class A083850 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A083850() {
    super(0, new A002113(), k -> k.isZero() ? Z.ONE : Functions.VALUATION.z(k, 11));
  }
}
