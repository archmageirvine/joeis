package irvine.oeis.a076;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003557;
import irvine.oeis.a007.A007947;

/**
 * A076332 a(n) = rad(n) + n/rad(n), where rad(n) is the squarefree kernel of n = A007947(n).
 * @author Georg Fischer
 */
public class A076332 extends AbstractSequence {

  private final A007947 mSeq1 = new A007947();
  private final A003557 mSeq2 = new A003557();

  /** Construct the sequence. */
  public A076332() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
