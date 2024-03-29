package irvine.oeis.a095;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007097;

/**
 * A095938 a(n+1) = (a(n)-1)-th prime + 1.
 * @author Georg Fischer
 */
public class A095938 extends AbstractSequence {

  private final AbstractSequence mSeq = new A007097();

  /** Construct the sequence. */
  public A095938() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().add(1);
  }
}
