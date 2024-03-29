package irvine.oeis.a262;
// Generated by gen_seq4.pl complem at 2023-09-11 12:28

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A262773 A Beatty sequence: a(n)=floor(q*n) where q=A231187.
 * @author Georg Fischer
 */
public class A262773 extends ComplementSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A262773() {
    super(0, new A262770(), Z.ZERO);
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : super.next();
  }
}
