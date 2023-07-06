package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.a005.A005043;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A103872 a(n) = 3*trinomial(n+1,0) - trinomial(n+2,0).
 * @author Georg Fischer
 */
public class A103872 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A103872() {
    super(0, new A005043().skip(), Z::multiply2);
  }
}
