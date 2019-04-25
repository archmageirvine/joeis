package irvine.oeis.a006;

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a000.A000244;

/**
 * A006899 Numbers of the form <code>2^i</code> or <code>3^j</code>.
 * @author Sean A. Irvine
 */
public class A006899 extends UnionSequence {

  /** Construct the sequence. */
  public A006899() {
    super(new A000079(), new A000244());
  }
}
