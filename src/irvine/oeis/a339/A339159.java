package irvine.oeis.a339;

import irvine.math.z.Z;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A339159 Number of achiral series-parallel networks with n elements.
 * @author Gregory Morse
 */
public class A339159 extends PairTransformSequence {
  /** Construct the sequence. */
  public A339159() {
    super(1, new A339157(), new A339158(), (n, u, v) -> n == 1 ? Z.ONE : u.add(v));
  }
}
