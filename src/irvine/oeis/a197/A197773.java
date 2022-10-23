package irvine.oeis.a197;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A197773 Ceiling((n+1/n)^3).
 * @author Georg Fischer
 */
public class A197773 extends Sequence1 {

  protected int mN = 0;
  protected final int mParm;

  /** 
   * Empty constructor
   */
  public A197773() {
    this(3);
  }
  
  /**
   * Constructor with parameter
   * @param parm parameter
   */
  public A197773(final int parm) {
    mParm = parm;
  }
 
  @Override
  public Z next() {
    final Q q = new Q(1, ++mN).add(mN).pow(mParm);
    return q.isInteger() ? q.toZ() : q.toZ().add(1);
  }
}
