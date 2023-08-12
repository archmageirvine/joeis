package irvine.oeis.a065;

import irvine.oeis.InverseSequence;
import irvine.oeis.a034.A034093;

/**
 * A065083 The least k such that precisely n near-repunit primes can be formed from (10^k-1)/9 by changing one digit from 1 to 0.
 * @author Sean A. Irvine
 */
public class A065083 extends InverseSequence {

  /** Construct the sequence. */
  public A065083() {
    super(0, new A034093(), 0);
  }
}
