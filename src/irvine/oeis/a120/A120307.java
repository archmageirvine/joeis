package irvine.oeis.a120;
// manually 2024-01-22/filter at 2024-01-22 17:22

import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.FilterSequence;
import irvine.oeis.a163.A163085;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A120307 Inverse determinant of n X n matrix M[i,j] = i*j/(i+j-1).
 * @author Georg Fischer
 */
public class A120307 extends FilterSequence {

  /** Construct the sequence. */
  public A120307() {
    super(1, new SimpleTransformSequence(0, new A163085(), (n, v) -> v.divide(MemoryFactorial.SINGLETON.factorial(n))), (k, v) -> (k & 1) == 0);
    next();
  }
}
