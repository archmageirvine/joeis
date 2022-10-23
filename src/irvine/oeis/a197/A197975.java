package irvine.oeis.a197;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A197975 Round((2*n+1/n)^n).
 * @author Georg Fischer
 */
public class A197975 extends Sequence1 {

  protected long mN = 0;
  protected final int mParm;

  /** 
   * Empty constructor
   */
  public A197975() {
    this(2);
  }
  
  /**
   * Constructor with parameter
   * @param parm parameter
   */
  public A197975(final int parm) {
    mParm = parm;
  }
 
  @Override
  public Z next() {
    ++mN;
    return new Q(1, mN).add(mN * mParm).pow(mN).add(Q.HALF).toZ();
  }
}
