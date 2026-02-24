package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A074648 a(n)=A074639(A074647(n)).
 * @author Sean A. Irvine
 */
public class A074648 extends FilterSequence {

  /** Construct the sequence. */
  public A074648() {
    super(1, new A074639(), (n, k) -> n > 0 && Functions.GCD.z(k, Functions.PHI.z(n)).isOne());
  }
}
