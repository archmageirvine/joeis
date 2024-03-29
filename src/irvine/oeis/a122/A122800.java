package irvine.oeis.a122;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a045.A045928;

/**
 * A122800 A P_4-stuttered arithmetic progression with a(n+1)=a(n) if n is square, a(n+1)=a(n)+2 otherwise.
 * @author Georg Fischer
 */
public class A122800 extends Sequence1 {

  final Sequence mA045928 = new A045928();
  protected long mN;
  /** Construct the sequence. */
  public A122800() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA045928.next().subtract(Z.valueOf(mN)).add(Z.ONE);
  }

}
