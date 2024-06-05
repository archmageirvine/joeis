package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a038.A038509;

/**
 * A069043 Composite numbers k with no prime factor among (2, 3) (cf. A038509) and such that phi(k) &lt; 2*k/3.
 * @author Sean A. Irvine
 */
public class A069043 extends FilterSequence {

  /** Construct the sequence. */
  public A069043() {
    super(1, new A038509(), k -> Functions.PHI.z(k).multiply(3).compareTo(k.multiply2()) < 0);
  }
}

