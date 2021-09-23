package irvine.oeis.a051;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a005.A005384;

/**
 * A051616 Primes for which A051614 is 3 but are not in A005834.
 * @author Sean A. Irvine
 */
public class A051616 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A051616() {
    super(new A051615(), new A005384());
  }
}
