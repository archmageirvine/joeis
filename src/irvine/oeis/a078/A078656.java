package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078656 a(n) = prime(k) where k = n-th prime congruent to 1 mod 10.
 * @author Sean A. Irvine
 */
public class A078656 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078656() {
    super(1, new FilterSequence(new A000040(), k -> k.mod(10) == 1), Functions.PRIME::z);
  }
}
