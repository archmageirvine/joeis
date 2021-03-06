package irvine.oeis.a038;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A038530 Concatenate n-th prime and n-th composite.
 * @author Georg Fischer
 */
public class A038530 extends A000040 {

  private final Sequence mCompos = new A002808();

  @Override
  public Z next() {
    return new Z(super.next().toString() + mCompos.next());
  }
}
