package irvine.oeis.a165;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A165768 Smallest prime factor of the semiprime 2^A165767(n)-A165767(n).
 * @author Georg Fischer
 */
public class A165768 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A165768() {
    super(1, new A165767(), v -> Functions.LPF.z(Z.TWO.pow(v).subtract(v)));
  }
}
