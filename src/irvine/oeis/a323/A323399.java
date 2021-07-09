package irvine.oeis.a323;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007434;
import irvine.oeis.a046.A046970;

/**
 * A323399 Sum of Jordan function J_2(n), A007434 and its Dirichlet inverse, A046970.
 * @author Georg Fischer
 */
public class A323399 extends A007434 {

  protected Sequence mSeq;

  /** Construct the sequence. */
  public A323399() {
    mSeq = new A046970();
  }

  @Override
  public Z next() {
    return super.next().add(mSeq.next());
  }

}
