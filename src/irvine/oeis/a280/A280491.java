package irvine.oeis.a280;
// Generated by gen_seq4.pl nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a122.A122111;

/**
 * A280491 a(n) = gcd(n,A122111(n)).
 * @author Georg Fischer
 */
public class A280491 extends AbstractSequence {

  private int mN;
  private final A122111 mSeq1 = new A122111();

  /** Construct the sequence. */
  public A280491() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).gcd(mSeq1.next());
  }
}
