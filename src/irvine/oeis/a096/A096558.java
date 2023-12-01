package irvine.oeis.a096;
// manually A096553/tuptraf at 2023-11-29 23:09

import irvine.math.z.Z;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A096558 Output of the linear congruential pseudo-random number generator rand() used in Microsoft's Visual C++.
 * @author Georg Fischer
 */
public class A096558 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A096558() {
    super(1, (n, s) -> s[0].multiply(214013).add(2531011).mod(Z.valueOf(4294967296L)), "0", PREVIOUS);
  }

  @Override
  public Z next() {
    // a(n)= (floor(b(n)/65536)) mod 32768).
    return super.next().divide(65536).modZ(32768);
  }
}
