package irvine.oeis.a101;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a069.A069904;

/**
 * A101745 Indices of triangular numbers which are 10-almost primes. Indices of A101744.
 * @author Georg Fischer
 */
public class A101745 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A101745() {
    super(1, 1, new A069904(), v -> v.equals(Z.TEN));
  }
}
