package irvine.oeis.a188;
// manually floor3 2020-06-09 22:00

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A188374 [nr+kr]-[nr]-[kr], where r=1/sqrt(2), k=2, [ ]=floor.
 * @author Georg Fischer
 */
public class A188374 implements Sequence {
  private long mN = 0;
  protected CR mR;
  protected final CR mK;

  /** Construct the sequence. */
  public A188374() {
    this(2, CR.ONE.divide(CR.SQRT2));
  }
  
  /**
   * Generic constructor with parameters.
   * @param k integer parameter 
   * @param r real parameter 
   */
  public A188374(final int k, final CR r) {
    mK = CR.valueOf(k);
    mR = r;
  }
  
  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(mR).add(mK.multiply(mR)).floor().subtract(n.multiply(mR).floor()).subtract(mK.multiply(mR).floor());
  }
}
