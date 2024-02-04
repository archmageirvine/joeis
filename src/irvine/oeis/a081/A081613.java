package irvine.oeis.a081;
// manually dirtraf at 2024-02-02 22:56

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;
import irvine.oeis.a008.A008908;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A081613 Length of iteration list when Collatz-function is iterated with initial value n!=A000142[n].
 * @author Georg Fischer
 */
public class A081613 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A081613() {
    super(0, new A008908(), new A000142());
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
