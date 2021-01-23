package irvine.oeis.a079;

import irvine.oeis.FiniteSequence;

/**
 * A079020 Suppose p and q = p+20 are primes. Define the difference pattern of (p,q) to be the successive differences of the primes in the range p to q. There are 56 possible difference patterns, shown in the Comments line. Sequence gives smallest value of p for each difference pattern, sorted by magnitude.
 * @author Georg Fischer
 */
public class A079020 extends FiniteSequence {

  /** Construct the sequence. */
  public A079020() {
    super(3, 11, 17, 23, 41, 47, 59, 83, 89, 107, 131, 137, 179, 191, 251, 293, 317, 347, 353, 359, 389, 401, 467, 503, 521, 593, 599, 653, 887, 947, 971, 1031, 1151, 1193, 1229, 1259, 1301, 1307, 1439, 1601, 1931, 1979, 1997, 2069, 2531, 3167, 3299, 4241, 5261, 5639, 5849, 8081, 10091, 17189, 18041, 19421);
  }
}
