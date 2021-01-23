package irvine.oeis.a197;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A197602 Floor((n+1/n)^3).
 * @author Georg Fischer
 */
public class A197602 implements Sequence {

  protected int mN = 0;
  protected final int mParm; 

  /** 
   * Empty constructor
   */
  public A197602() {
    this(3);
  }
  
  /**
   * Constructor with parameter
   * @param parm parameter
   */
  public A197602(final int parm) {
    mParm = parm;
  }
 
  @Override
  public Z next() {
    final Q q = new Q(1, ++mN).add(mN).pow(mParm);
    return q.toZ();
  }
}
