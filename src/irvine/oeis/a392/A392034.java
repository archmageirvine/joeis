package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a291.A291463;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A392034 a(n) = prime(n)*(prime(n+1) - prime(n))/2.
 * @author Sean A. Irvine
 */
public class A392034 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A392034() {
    super(new A291463(), Z::divide2);
  }
}
