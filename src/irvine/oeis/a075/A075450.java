package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;

/**
 * A075450 a(n)=A075443(A075449(n)).
 * @author Sean A. Irvine
 */
public class A075450 extends FilterSequence {

  /** Construct the sequence. */
  public A075450() {
    super(1, new A075443(), (n, k) -> n > 0 && k.mod(Functions.PHI.l(n)) == 0);
  }
}
