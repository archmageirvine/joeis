package irvine.oeis.a070;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a016.A016014;

/**
 * A070846 Smallest prime == 1 (mod 2n).
 * @author Georg Fischer
 */
public class A070846 implements Sequence {

  final Sequence mA016014 = new A016014();
  protected long mN;
  /** Construct the sequence. */
  public A070846() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(Z.valueOf(mN)).multiply(mA016014.next()).add(Z.ONE);
  }

}
