package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A075452 a(n) = A075443(A075451(n)).
 * @author Sean A. Irvine
 */
public class A075452 extends FilterSequence {

  /** Construct the sequence. */
  public A075452() {
    super(1, new A075443(), (n, k) -> n > 0 && k.gcd(Functions.PHI.l(n)).equals(Z.ONE));
  }
}
