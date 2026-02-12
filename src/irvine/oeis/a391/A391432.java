package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a005.A005652;
import irvine.oeis.a035.A035508;

/**
 * A391432 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A391432 extends ComplementSequence {

  /** Construct the sequence. */
  public A391432() {
    super(1, Z.ONE, new UnionSequence(new A005652().skip(), new A035508().skip()));
  }
}
