package irvine.oeis.a193;
// Generated by gen_seq4.pl simgcd at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a135.A135079;

/**
 * A193198 G.f.: A(x) = Sum_{n&gt;=0} x^n/(1 - 3^n*x)^n.
 * @author Georg Fischer
 */
public class A193198 extends AbstractSequence {

  private final AbstractSequence mSeq = new A135079();

  /** Construct the sequence. */
  public A193198() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq.next().add(1).divide2();
  }
}
