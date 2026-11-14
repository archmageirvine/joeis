package irvine.oeis.a087;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a068.A068632;

/**
 * A087379 Beginning with 2, primes such that the difference between two successive terms is a distinct composite number.
 * @author Sean A. Irvine
 */
public class A087379 extends PartialSumSequence {

  /** Construct the sequence. */
  public A087379() {
    super(0, new A068632());
  }
}
