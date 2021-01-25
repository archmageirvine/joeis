package irvine.oeis.a197;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A197716 Ceiling((2n+1/n)^n).
 * @author Georg Fischer
 */
public class A197716 implements Sequence {

  protected long mN = 0;
  protected final int mParm;

  /** 
   * Empty constructor
   */
  public A197716() {
    this(2);
  }
  
  /**
   * Constructor with parameter
   * @param parm parameter
   */
  public A197716(final int parm) {
    mParm = parm;
  }
 
  @Override
  public Z next() {
    final Q q = new Q(1, ++mN).add(mN * mParm).pow(mN);
    return q.isInteger() ? q.toZ() : q.toZ().add(1);
  }
}
