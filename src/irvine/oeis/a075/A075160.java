package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075160 Prime factorization of n encoded with the run lengths of binary expansion + 1.
 * @author Sean A. Irvine
 */
public class A075160 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075160() {
    super(1, new A075158(), Z.ONE::add);
  }
}
