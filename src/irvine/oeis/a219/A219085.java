package irvine.oeis.a219;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A219085 Floor((n + 1/2)^3).
 * @author Georg Fischer
 */
public class A219085 implements Sequence {

  protected int mN = -1;
  protected final int mParm;

  /** 
   * Empty constructor
   */
  public A219085() {
    this(3);
  }
  
  /**
   * Constructor with parameter
   * @param parm parameter
   */
  public A219085(final int parm) {
    mParm = parm;
  }

  @Override
  public Z next() {
    ++mN;
    return Q.HALF.add(mN).pow(mParm).toZ();
  }
}
