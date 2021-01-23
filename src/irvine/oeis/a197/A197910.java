package irvine.oeis.a197;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A197910 Ceiling((n+1/2)^n).
 * @author Georg Fischer
 */
public class A197910 implements Sequence {

  protected int mN = 0;
  protected final Q mParm;

  /** 
   * Empty constructor
   */
  public A197910() {
    this(2);
  }
  
  /**
   * Constructor with parameter
   * @param parm parameter
   */
  public A197910(final int parm) {
    mParm = new Q(1, parm);
  }

  @Override
  public Z next() {
    ++mN;
    final Q q = mParm.add(mN).pow(mN);
    return q.isInteger() ? q.toZ() : q.toZ().add(1);
  }
}
