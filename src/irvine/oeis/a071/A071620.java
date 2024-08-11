package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.oeis.a176.A176942;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071620 Integer lengths of the Champernowne primes (concatenation of first a(n) entries (digits) of A033307 is prime).
 * @author Sean A. Irvine
 */
public class A071620 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071620() {
    super(1, new A176942(), k -> Functions.DIGIT_LENGTH.z(k));
  }
}
