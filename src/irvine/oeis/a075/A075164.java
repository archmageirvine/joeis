package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075164 Position of A014486(n-1) in A075165.
 * @author Sean A. Irvine
 */
public class A075164 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075164() {
    super(1, new A075162(), Z.ONE::add);
  }
}
