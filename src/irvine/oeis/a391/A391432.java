package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a005.A005652;
import irvine.oeis.a035.A035508;

/**
 * A391432 Complement of the union of A005652(k), k&gt;=2 and A035508(k), k&gt;=1.
 * @author Sean A. Irvine
 */
public class A391432 extends ComplementSequence {

  /** Construct the sequence. */
  public A391432() {
    super(1, Z.ONE, new UnionSequence(new A005652().skip(), new A035508().skip()));
  }
}
