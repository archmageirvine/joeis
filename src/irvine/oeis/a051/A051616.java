package irvine.oeis.a051;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a005.A005384;

/**
 * A051616 Primes p for which A051614(p) is 3 but are not Sophie Germain primes.
 * @author Sean A. Irvine
 */
public class A051616 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A051616() {
    super(new A051615(), new A005384());
  }
}
