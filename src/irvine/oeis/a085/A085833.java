package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A085833 Start at (2n+1)/4 and iterate the map x -&gt; x*ceiling(x); sequence gives values of n for which the denominators in the orbit go from 4 to 2, instead of dropping directly to 1.
 * @author Sean A. Irvine
 */
public class A085833 extends ComplementSequence {

  /** Construct the sequence. */
  public A085833() {
    super(1, Z.TWO, new A085817());
  }
}
