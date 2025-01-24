package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;

/**
 * A074646 a(n) = A074639(A074645(n)).
 * @author Sean A. Irvine
 */
public class A074646 extends FilterSequence {

  /** Construct the sequence. */
  public A074646() {
    super(1, new A074639(), (n, k) -> n > 0 && k.mod(Functions.PHI.l(n)) == 0);
  }
}
