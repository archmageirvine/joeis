package irvine.oeis.a293;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A293757 Numbers k such that (10^k - 97)/3 is prime.
 * @author Georg Fischer
 */
public class A293757 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A293757() {
    super("[[873],[10],[-1]]", "[-96,-87]", 0, primeDivTest(Z.THREE));
  }

}
