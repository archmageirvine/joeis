package irvine.oeis.a197;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A197712 a(n) = floor((n+1/2)^n).
 * @author Georg Fischer
 */
public class A197712 extends Sequence1 {

  protected int mN = 0;
  protected final Q mParm;

  /** 
   * Empty constructor
   */
  public A197712() {
    this(2);
  }
  
  /**
   * Constructor with parameter
   * @param parm parameter
   */
  public A197712(final int parm) {
    mParm = new Q(1, parm);
  }

  @Override
  public Z next() {
    ++mN;
    return mParm.add(mN).pow(mN).toZ();
  }
}
