package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080120 Dyck path encodings of Legendre's candelabras formed for primes in A080114. (I.e., symmetric rooted plane trees constructed from their quadratic residue sets.).
 * @author Sean A. Irvine
 */
public class A080120 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080120() {
    super(1, new A080118(), k -> new Z(k.toString(2)));
  }

}

