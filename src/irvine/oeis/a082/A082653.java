package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.InverseSequence;
import irvine.oeis.a060.A060863;

/**
 * A082653 For smallest numbers k such that A082596(k) = n, sequence gives A060863(k).
 * @author Sean A. Irvine
 */
public class A082653 extends InverseSequence {

  private final DirectSequence mA = DirectSequence.create(new A060863());

  /** Construct the sequence. */
  public A082653() {
    super(1, new A082596());
  }

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
