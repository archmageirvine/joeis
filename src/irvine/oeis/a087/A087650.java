package irvine.oeis.a087;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000296;

/**
 * A087650 a(n) = Sum_{k=0..n} (-1)^(n-k)*Bell(k).
 * @author Georg Fischer
 */
public class A087650 implements Sequence {

  final Sequence mA000296 = new A000296();
  protected long mN;
  /** Construct the sequence. */
  public A087650() {
    mN = -1;
    mA000296.next();
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA000296.next().add((mN & 1L) == 0 ? Z.ONE : Z.NEG_ONE);
  }

}
